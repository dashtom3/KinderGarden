package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TMenuDao;
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

        String sql = "select n.id as id,"
                + "n.name as name,"
                + "n.type as type,"
                + "n.img_id as imgId,"
                + "c as image"
                + "from t_menu n,t_file c "
                + "where n.img_id = c.id";
        sql += " order by n.type asc";
        Session session = getSession();
        Query query = session.createSQLQuery(sql)
                .addScalar("id", StandardBasicTypes.LONG)
                .addScalar("name", StandardBasicTypes.STRING)
                .addScalar("type", StandardBasicTypes.INTEGER)
                .addScalar("imgId", StandardBasicTypes.LONG)
                .addScalar("image", StandardBasicTypes.CLASS)
                .setResultTransformer(Transformers.aliasToBean(TMenuEntity.class));

        ret = query.list();
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }
}
