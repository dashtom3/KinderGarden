package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TFileDao;
import cn.jiang.garden.DAO.TJobApplicationDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.model.TUserEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.service.JobApplicationService;
import cn.jiang.garden.utils.BaseUtil;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.List;


@Service("jobApplicationService")
public class JobApplicationServiceImpl implements JobApplicationService {
    @Autowired
    TTokenDao tokenDao;
    @Autowired
    TUserDao userDao;
    @Autowired
    TJobApplicationDao jobApplicationDao;
    @Autowired
    FileService fileService;
    @Autowired
    TFileDao fileDao;
    @Override
    public DataWrapper<Void> addJobApplication(TJobApplicationEntity jobApplicationEntity, MultipartFile photo, MultipartFile resume,HttpServletRequest request) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        if(jobApplicationEntity != null && jobApplicationEntity.getName() != null && jobApplicationEntity.getTel() != null) {
            jobApplicationEntity.setId(null);
            jobApplicationEntity.setBirth(BaseUtil.stringToSqlDate(jobApplicationEntity.getBirthDay()));

            TFileEntity photoEntity = new TFileEntity();
            TFileEntity resumeEntity = new TFileEntity();

            photoEntity.setType(10);
            photoEntity.setId(null);
            resumeEntity.setType(9);
            resumeEntity.setId(null);
            fileService.uploadFile(request,null,photoEntity,photo);
            fileService.uploadFile(request,null,resumeEntity,resume);

            TFileEntity emptyFile = fileDao.findByType(11).getData().get(0);
            jobApplicationEntity.setImgId(photoEntity.getId() == null ? emptyFile.getId() : photoEntity.getId());
            jobApplicationEntity.setFileId(resumeEntity.getId() == null ? emptyFile.getId() : resumeEntity.getId());

            jobApplicationEntity.setApplicatedDate(new Date(System.currentTimeMillis()));

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
    public DataWrapper<Void> deleteJobApplication(String token, Long jobApplicationId,HttpServletRequest request) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        TUserEntity user = userDao.getUserByToken(token);
        if (user != null && user.getType() == 0) {
            TJobApplicationEntity jobApplicationEntity = jobApplicationDao.getJobApplicationById(jobApplicationId);
            if(jobApplicationEntity != null) {
                jobApplicationDao.deleteJobApplication(jobApplicationId);
                fileService.deleteFile(jobApplicationEntity.getFileId(),null,request);
                fileService.deleteFile(jobApplicationEntity.getImgId(),null,request);

            }
        } else{
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }

        return retDataWrapper;
    }

    @Override
    public DataWrapper<List<TJobApplicationEntity>> getJobApplicationList(String token,String condition) {
        DataWrapper<List<TJobApplicationEntity>> retDataWrapper = new DataWrapper<List<TJobApplicationEntity>>();
        TUserEntity user = userDao.getUserByToken(token);
        if ( user != null && user.getType() == 0) {
            retDataWrapper = jobApplicationDao.getJobApplicationList(condition);
        } else{
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }

        return retDataWrapper;
    }
}
