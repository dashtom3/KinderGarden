package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TNewsDao;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
@Repository
public class TNewsDaoImpl extends BaseDao<TNewsEntity> implements TNewsDao {
    @Override
    public boolean addTNews(TNewsEntity tnews){
        return save(tnews);
    }
    @Override
    public boolean deleteTNews(Long tnewsId){
        return delete(get(tnewsId));
    }
    @Override
    public boolean updateTNews(TNewsEntity tnews){
        return update(tnews);
    }
    @Override
    public DataWrapper<List<TNewsEntity>> getTNewsList(int type){
        DataWrapper<List<TNewsEntity>> retDataWrapper = new DataWrapper<List<TNewsEntity>>();
        List<TNewsEntity> ret = new ArrayList<TNewsEntity>();
        Session session = getSession();
        Criteria criteria = session.createCriteria(TNewsEntity.class);
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
    public DataWrapper<TNewsEntity> getTNews(int type) {
        return null;
    }
}
