package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TMenuDao;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TMenuEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

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
    public DataWrapper<List<TMenuEntity>> getTMenuList() {
        DataWrapper<List<TMenuEntity>> retDataWrapper = new DataWrapper<List<TMenuEntity>>();
        List<TMenuEntity> ret;
        ret = null;
        String sql = "select {n.*},{c.*} "
                + "from t_menu n,t_file c "
                + "where c.id = n.img_id ";
        sql += " order by n.type asc";

        Session session = getSession();
        Query query = session.createSQLQuery(sql)
                .addEntity("n",TMenuEntity.class)
                .addJoin("c", "n.image");
        try {
            ret = query.list();

        }catch (Exception e){
            e.printStackTrace();
        }
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }
}
