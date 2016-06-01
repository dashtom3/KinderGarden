package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TUserEntity;

/**
 * Created by Administrator on 2016/5/28.
 */
public interface TUserDao {
    boolean addUser(TUserEntity user);
    boolean deleteUser(TUserEntity user);
    boolean updateUser(TUserEntity user);
    TUserEntity findByUserName(String userName);
    TUserEntity getUserById(Long id);
    TUserEntity getUserByToken(String token);
}
