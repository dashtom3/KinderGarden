package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TUserApplicationDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TUserApplicationEntity;
import cn.jiang.garden.model.TUserEntity;
import cn.jiang.garden.service.UserApplicationService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userApplicationService")
public class UserApplicationServiceImpl implements UserApplicationService {

    @Autowired
    TUserApplicationDao userApplicationDao;
    @Autowired
    TUserDao userDao;
    @Override
    public DataWrapper<Void> addUserApplication(TUserApplicationEntity userApplicationEntity) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        if(userApplicationDao.addUserApplication(userApplicationEntity)) {
            retDataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
        } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);

        return retDataWrapper;
    }

    @Override
    public DataWrapper<Void> deleteUserApplication(Long userApplicationId,String token) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        TUserEntity user = userDao.getUserByToken(token);
        if(user != null) {
            if(user.getApplicationId() == userApplicationId || user.getType() == 0) {
                if(userApplicationDao.deleteUserApplication(userApplicationId)) {
                    retDataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
                } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
            } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return retDataWrapper;
    }

    @Override
    public DataWrapper<Void> updateUserApplication(TUserApplicationEntity userApplicationEntity, String token) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        TUserEntity user = userDao.getUserByToken(token);
        if(user != null && userApplicationEntity != null && user.getApplicationId() == userApplicationEntity.getId()) {
            if(userApplicationDao.updateUserApplication(userApplicationEntity)) {
                retDataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
            } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return retDataWrapper;
    }

    @Override
    public DataWrapper<List<TUserApplicationEntity>> getUserApplicationList(Integer state, String token) {
        DataWrapper<List<TUserApplicationEntity>> retDataWrapper = new DataWrapper<List<TUserApplicationEntity>>();
        TUserEntity user = userDao.getUserByToken(token);
        if(user != null && user.getType() == 0) {
            retDataWrapper = userApplicationDao.getUserApplicationListByState(state);
        } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return retDataWrapper;
    }

    @Override
    public DataWrapper<TUserApplicationEntity> getUserApplication(Long userApplicationId,String token) {
        DataWrapper<TUserApplicationEntity> retDataWrapper = new DataWrapper<TUserApplicationEntity>();
        TUserEntity user = userDao.getUserByToken(token);
        if(user != null && userApplicationId != null) {
            if(user.getType() == 0 || user.getApplicationId() == userApplicationId) {
                TUserApplicationEntity userApplicationEntity = userApplicationDao.getUserApplicationById(userApplicationId);
                retDataWrapper.setData(userApplicationEntity);
            } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return retDataWrapper;
    }
}
