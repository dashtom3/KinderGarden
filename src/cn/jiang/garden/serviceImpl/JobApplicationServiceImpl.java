package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TJobApplicationDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.service.JobApplicationService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("jobApplicationService")
public class JobApplicationServiceImpl implements JobApplicationService {
    @Autowired
    TTokenDao tokenDao;
    @Autowired
    TUserDao userDao;
    @Autowired
    TJobApplicationDao jobApplicationDao;
    @Override
    public DataWrapper<Void> addJobApplication(String token, TJobApplicationEntity jobApplicationEntity) {
        TTokenEntity tokenEntity = tokenDao.findByTokenString(token);
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        if(tokenEntity != null) {
            if(jobApplicationDao.addJobApplication(jobApplicationEntity)) {
                retDataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
            }else {
                retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
            }
        }else {
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return retDataWrapper;
    }

    @Override
    public DataWrapper<Void> deleteJobApplication(String token, Long jobApplicationId) {
        TTokenEntity tokenEntity = tokenDao.findByTokenString(token);
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        if (tokenEntity != null && userDao.getUserById(tokenEntity.getUserId()).getType() == 0) {
            if (jobApplicationDao.deleteJobApplication(jobApplicationId)) {
                retDataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
            } else {
                retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
            }
        } else{
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }

        return retDataWrapper;
    }

    @Override
    public DataWrapper<List<TJobApplicationEntity>> getJobApplicationList(String token) {
        TTokenEntity tokenEntity = tokenDao.findByTokenString(token);
        DataWrapper<List<TJobApplicationEntity>> retDataWrapper = new DataWrapper<List<TJobApplicationEntity>>();
        if (tokenEntity != null && userDao.getUserById(tokenEntity.getUserId()).getType() == 0) {
            retDataWrapper = jobApplicationDao.getJobApplicationList();
        } else{
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }

        return retDataWrapper;
    }
}
