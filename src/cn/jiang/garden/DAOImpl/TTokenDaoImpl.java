package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.model.TTokenEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TTokenDaoImpl extends BaseDao<TTokenEntity> implements TTokenDao {

    @Override
    public boolean addToken(TTokenEntity token) {
        return save(token);
    }

    @Override
    public boolean deleteToken(TTokenEntity token) {
        return delete(token);
    }

    @Override
    public boolean updateToken(TTokenEntity token) {
        return update(token);
    }

    @Override
    public TTokenEntity findByTokenString(String token) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(TTokenEntity.class);
        criteria.add(Restrictions.eq("token", token));
        List<TTokenEntity> result = criteria.list();
        if (result != null && result.size() > 0) {
            return (TTokenEntity) result.get(0);
        }
        return null;
    }

    @Override
    public TTokenEntity findByUserId(Long userId) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(TTokenEntity.class);
        criteria.add(Restrictions.eq("userId", userId));
        List<TTokenEntity> result = criteria.list();
        if (result != null && result.size() > 0) {
            return (TTokenEntity) result.get(0);
        }
        return null;
    }
}
