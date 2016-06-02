package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TUserApplicationDao;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.model.TUserApplicationEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TUserApplicationDaoImpl  extends BaseDao<TUserApplicationEntity> implements TUserApplicationDao {
    @Override
    public boolean addUserApplication(TUserApplicationEntity userApplicationEntity) {
        return save(userApplicationEntity);
    }

    @Override
    public boolean deleteUserApplication(Long id) {
        return delete(get(id));
    }

    @Override
    public boolean updateUserApplication(TUserApplicationEntity userApplicationEntity) {
        return update(userApplicationEntity);
    }

    @Override
    public DataWrapper<List<TUserApplicationEntity>> getUserApplicationListByState(Integer state) {
        DataWrapper<List<TUserApplicationEntity>> retDataWrapper = new DataWrapper<List<TUserApplicationEntity>>();
        List<TUserApplicationEntity> ret;
        Session session = getSession();
        Criteria criteria = session.createCriteria(TNewsEntity.class);
        if(state == null) state = 0;
        criteria.add(Restrictions.eq("state", state));
        criteria.addOrder(Order.desc("id"));

        ret = criteria.list();

        retDataWrapper.setData(ret);
        return retDataWrapper;
    }

    @Override
    public TUserApplicationEntity getUserApplicationById(Long id) {
        return get(id);
    }
}
