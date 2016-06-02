package cn.jiang.garden.service;

import cn.jiang.garden.utils.DataWrapper;


public interface UserService {
    DataWrapper<Void> login(String userName,String password);

    boolean checkUser(String token);

    boolean checkAdmin(String token);
}
