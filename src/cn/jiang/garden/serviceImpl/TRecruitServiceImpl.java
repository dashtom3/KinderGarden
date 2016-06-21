package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TNewsDao;
import cn.jiang.garden.DAO.TRecruitDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TRecruitEntity;
import cn.jiang.garden.service.TRecruitService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by tia on 16/5/31.
 */
@Service("tRecruitService")
public class TRecruitServiceImpl implements TRecruitService{
    @Autowired
    TRecruitDao tRecruitDao;

    @Autowired
    TTokenDao tokenDao;
    @Override
    public DataWrapper<Void> addTRecruit(TRecruitEntity tRecruit, String tokenString) {
        tRecruit.setPublishDate(new Date(System.currentTimeMillis()));
        boolean result = tRecruitDao.addTRecruit(tRecruit);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }

    @Override
    public DataWrapper<Void> updateTRecruit(TRecruitEntity tRecruit, String tokenString) {
        boolean result = tRecruitDao.updateTRecruit(tRecruit);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }

    @Override
    public DataWrapper<Void> deleteTRecruit(Long tRecruitId, String tokenString) {
        boolean result = tRecruitDao.deleteTRecruit(tRecruitId);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }

    @Override
    public DataWrapper<List<TRecruitEntity>> getTRecruitList(String tokenString) {
        return tRecruitDao.getTRecruitList();
    }

    @Override
    public DataWrapper<Void> changeTRecruitState(Long tRecruitId,int state, String tokenString) {
        TRecruitEntity tRecruitEntity = tRecruitDao.getTRecruit(tRecruitId);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(tRecruitEntity == null){
            data.setErrorCode(ErrorCodeEnum.Error);
            return data;
        }
        tRecruitEntity.setState(state);
        boolean result = tRecruitDao.updateTRecruit(tRecruitEntity);
        if(result){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }
}
