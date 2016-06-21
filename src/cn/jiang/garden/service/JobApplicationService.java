package cn.jiang.garden.service;

import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/5/31.
 */
public interface JobApplicationService {
    DataWrapper<Void> addJobApplication(TJobApplicationEntity jobApplicationEntity, MultipartFile photo, MultipartFile resume,HttpServletRequest request);
    DataWrapper<Void> deleteJobApplication(String token,Long jobApplicationId,HttpServletRequest request);
    DataWrapper<List<TJobApplicationEntity>> getJobApplicationList(String token,String condition);
}
