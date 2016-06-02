package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TUserApplicationEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by Administrator on 2016/6/2.
 */
public interface TUserApplicationDao {
    boolean addUserApplication(TUserApplicationEntity userApplicationEntity);
    boolean deleteUserApplication(Long id);
    boolean updateUserApplication(TUserApplicationEntity userApplicationEntity);
    DataWrapper<List<TUserApplicationEntity>> getUserApplicationListByState(Integer state);
    TUserApplicationEntity getUserApplicationById(Long id);
}
