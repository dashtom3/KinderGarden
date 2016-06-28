package cn.jiang.garden.serviceImpl;


import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.model.TUserEntity;
import cn.jiang.garden.service.UserService;
import cn.jiang.garden.utils.DataWrapper;
import cn.jiang.garden.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    TUserDao userDao;

    @Autowired
    TTokenDao tokenDao;

    @Override
    public DataWrapper<Void> login(String userName, String password) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        TUserEntity user = userDao.findByUserName(userName);
        if(user != null) {
            if(user.getPassword().equals(MD5Util.getMD5String(password))) {
                String tokenString = MD5Util.getMD5String(userName + new Date().toString() + password);
                TTokenEntity token = tokenDao.findByUserId(user.getId());
                boolean loginState = false;
                if (token == null) {
                    token = new TTokenEntity();
                    System.out.println(tokenString);
                    token.setToken(tokenString);
                    token.setLoginDate(new Timestamp(System.currentTimeMillis()));
                    token.setUserId(user.getId());
                    loginState = tokenDao.addToken(token);
                } else {
                    token.setToken(tokenString);
                    token.setLoginDate(new Timestamp(System.currentTimeMillis()));
                    loginState = tokenDao.updateToken(token);
                }
                if(loginState) {
                    retDataWrapper.setToken(tokenString);
                } else {
                    retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
                }

            } else {
                retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
            }
        } else {
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }

        return retDataWrapper;
    }

    @Override
    public DataWrapper<Void> register(TUserEntity userEntity, String token) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        TUserEntity user = userDao.getUserByToken(token);
        if(user != null && user.getType() == 0) {
            if(userEntity != null && userEntity.getUserName() != null && userEntity.getPassword() != null
                    && userEntity.getApplicationId() != null) {
                userEntity.setId(null);
                userEntity.setRegisterDate(new java.sql.Date(System.currentTimeMillis()));
                userEntity.setType(1);
                if(userDao.addUser(userEntity))
                    retDataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
                else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);

            } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);

        } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);

        return retDataWrapper;
    }

    @Override
    public boolean checkUser(String token) {
        TUserEntity user = userDao.getUserByToken(token);
        if(user != null) {
            return true;
        } else return false;
    }

    @Override
    public boolean checkAdmin(String token) {
        TUserEntity user = userDao.getUserByToken(token);
        if(user != null && user.getType() == 0) {
            return true;
        } else return false;
    }
}
