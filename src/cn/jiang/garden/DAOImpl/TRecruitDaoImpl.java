package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TRecruitDao;
import cn.jiang.garden.model.TRecruitEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tia on 16/5/31.
 */
@Repository
public class TRecruitDaoImpl extends BaseDao<TRecruitEntity> implements TRecruitDao{

    @Override
    public boolean addTRecruit(TRecruitEntity tRecruit) {
        return save(tRecruit);
    }

    @Override
    public boolean deleteTRecruit(Long tRecruitId) {
        return delete(get(tRecruitId));
    }

    @Override
    public boolean updateTRecruit(TRecruitEntity tRecruit) {
        return update(tRecruit);
    }

    @Override
    public DataWrapper<List<TRecruitEntity>> getTRecruitList() {
        DataWrapper<List<TRecruitEntity>> retDataWrapper = new DataWrapper<List<TRecruitEntity>>();
        List<TRecruitEntity> ret = new ArrayList<TRecruitEntity>();
        Session session = getSession();
        Criteria criteria = session.createCriteria(TRecruitEntity.class);
        criteria.addOrder(Order.desc("publishDate"));
        try {
            ret = criteria.list();
        }catch (Exception e){
            System.out.println(e);
        }
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }

    @Override
    public TRecruitEntity getTRecruit(Long tRecruitId) {
        return get(tRecruitId);
    }
}
