package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.model.TUserEntity;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TUserDaoImpl extends BaseDao<TUserEntity> implements TUserDao {
    @Override
    public boolean addUser(TUserEntity user) {
        return save(user);
    }

    @Override
    public boolean deleteUser(TUserEntity user) {
        return delete(user);
    }

    @Override
    public boolean updateUser(TUserEntity user) {
        return update(user);
    }

    @Override
    public TUserEntity findByUserName(String userName) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(TUserEntity.class);
        criteria.add(Restrictions.eq("userName", userName));
        List<TUserEntity> result = criteria.list();
        if (result != null && result.size() > 0) {
            return (TUserEntity) result.get(0);
        }
        return null;
    }

    @Override
    public TUserEntity getUserById(Long id) {
        return get(id);
    }

    @Override
    public TUserEntity getUserByToken(String token) {

        String sql = "select user.* from t_user user,t_token token where token.token = " + token + " and token.user_id = user.id";
        Session session = getSession();
        Query query = session.createSQLQuery(sql)
                .addEntity(TUserEntity.class);

        List<TUserEntity> userList = query.list();
        if(userList != null && userList.size() > 0) {
            return userList.get(0);
        }else {
            return null;
        }
    }
}
