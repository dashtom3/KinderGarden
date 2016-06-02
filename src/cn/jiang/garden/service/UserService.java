package cn.jiang.garden.service;

import cn.jiang.garden.model.TUserEntity;
import cn.jiang.garden.utils.DataWrapper;


public interface UserService {
    DataWrapper<Void> login(String userName,String password);
    DataWrapper<Void> register(TUserEntity userEntity,String token);

    boolean checkUser(String token);

    boolean checkAdmin(String token);
}
