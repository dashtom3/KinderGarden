package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.model.TTokenEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/5/28.
 */
@Repository
public class TTokenDaoImpl extends BaseDao<TTokenEntity> implements TTokenDao {

    @Override
    public boolean addToken(TTokenEntity token) {
        return save(token);
    }
}
