package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.model.TUserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/5/28.
 */
@Repository
public class TUserDaoImpl extends BaseDao<TUserEntity> implements TUserDao {
    @Override
    public boolean addUser(TUserEntity user) {
        return save(user);
    }
}
