package cn.jiang.garden.service;

import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by Administrator on 2016/5/31.
 */
public interface JobApplicationService {
    DataWrapper<Void> addJobApplication(String token,TJobApplicationEntity jobApplicationEntity);
    DataWrapper<Void> deleteJobApplication(String token,Long jobApplicationId);
    DataWrapper<List<TJobApplicationEntity>> getJobApplicationList(String token);
}
