package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by Administrator on 2016/5/31.
 */
public interface TJobApplicationDao {
    boolean addJobApplication(TJobApplicationEntity jobApplication);
    DataWrapper<List<TJobApplicationEntity>> getJobApplicationList();
    boolean deleteJobApplication(Long jobApplicationId);
}
