package cn.jiang.garden.service;

import cn.jiang.garden.model.TUserApplicationEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by Administrator on 2016/6/2.
 */
public interface UserApplicationService {
    DataWrapper<Void> addUserApplication(TUserApplicationEntity userApplicationEntity);
    DataWrapper<Void> deleteUserApplication(Long userApplicationId,String token);
    DataWrapper<Void> updateUserApplication(TUserApplicationEntity userApplicationEntity,String token);
    DataWrapper<List<TUserApplicationEntity>> getUserApplicationList(Integer state,String token);
    DataWrapper<TUserApplicationEntity> getUserApplication(Long userApplicationId,String token);
}
