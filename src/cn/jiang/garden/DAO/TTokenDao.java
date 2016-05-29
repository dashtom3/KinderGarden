package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TTokenEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/5/28.
 */
public interface TTokenDao {
    boolean addToken(TTokenEntity token);
    boolean deleteToken(TTokenEntity token);
    boolean updateToken(TTokenEntity token);
    TTokenEntity findByTokenString(String token);
    TTokenEntity findByUserId(Long userId);
}
