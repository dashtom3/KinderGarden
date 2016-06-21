package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TMenuDao;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TMenuEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;

/**
 * Created by tia on 16/5/30.
 */
@Repository
public class TMenuDaoImpl extends BaseDao<TMenuEntity> implements TMenuDao{


    @Override
    public boolean updateTMenu(TMenuEntity tMenu) {
        return update(tMenu);
    }

    @Override
    public DataWrapper<List<TMenuEntity>> getTMenuListByType(Integer type,Integer timeType) {
        DataWrapper<List<TMenuEntity>> retDataWrapper = new DataWrapper<List<TMenuEntity>>();
        List<Object[]> list = null;
        List<TMenuEntity> ret = new ArrayList<TMenuEntity>();

        String sql = "select {n.*},{c.*} "
                + "from t_menu n,t_file c "
                + "where c.id = n.img_id ";
        if(type != null) {
            sql += " and n.type = " + type;
        }
        if(timeType != null) {
            sql += " and n.time_type = " + timeType;
        }
        sql += " order by n.type asc,n.time_type asc";

        Session session = getSession();
        Query query = session.createSQLQuery(sql)
                .addEntity("n",TMenuEntity.class)
                .addEntity("c", TFileEntity.class);
        try {
            list = query.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        for(int i=0;i<list.size();i++){
            TMenuEntity temp =(TMenuEntity)list.get(i)[0];
            temp.setImage((TFileEntity)list.get(i)[1]);
            ret.add(temp);
        }
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }

    @Override
    public boolean deleteTMenu(Long id) {
        return delete(get(id));
    }

    @Override
    public boolean addTMenu(TMenuEntity tMenu) {
        return save(tMenu);
    }

    @Override
    public TMenuEntity getByTypeAndImgId(Integer type, Integer timeType, Long imgId) {

        Session session = getSession();
        Criteria criteria = session.createCriteria(TMenuEntity.class);
        criteria.add(Restrictions.eq("type", type));
        criteria.add(Restrictions.eq("timeType", timeType));
        criteria.add(Restrictions.eq("imgId", imgId));
        List ret = criteria.list();
        if(ret != null && ret.size() > 0) {
            return (TMenuEntity)ret.get(0);
        }
        return  null;

    }
}
