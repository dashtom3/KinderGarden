package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TNewsDao;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Criteria;
import org.hibernate.Query;
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
    public DataWrapper<TNewsEntity> getHomeData() {
        DataWrapper<TNewsEntity> retDataWrapper = new DataWrapper<TNewsEntity>();
        List<Object[]> list = null;
        TNewsEntity ret = new TNewsEntity();

        String sql = "select {n.*},{c.*} "
                + "from t_news n,t_file c "
                + "where n.type = 0 and (n.img_id1 = c.id or n.img_id2 = c.id or n.img_id3 = c.id)";
        sql += " order by n.type asc";
        Session session = getSession();
        Query query = session.createSQLQuery(sql)
                .addEntity("n",TNewsEntity.class)
                .addEntity("c",TFileEntity.class);
        try {
            list = query.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        //添加新闻和横幅图片
        if(list != null){
            ret = (TNewsEntity) list.get(0)[0];
            List<TFileEntity> pic = new ArrayList<TFileEntity>();
            for(int i =0;i<list.size();i++){
                pic.add((TFileEntity) list.get(i)[1]);
            }
            ret.setHomeBanner(pic);
        }
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }
}
