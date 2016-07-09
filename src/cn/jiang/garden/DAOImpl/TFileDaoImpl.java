package cn.jiang.garden.DAOImpl;


import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TFileDao;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TFileDaoImpl extends BaseDao<TFileEntity> implements TFileDao {
    @Override
    public boolean addFile(TFileEntity file) {
        return save(file);
    }

    @Override
    public boolean deleteFile(Long fileId) {
        try {
            return delete(get(fileId));
        }catch (Exception e){

        }
        return  false;
    }

    @Override
    public boolean updateFile(TFileEntity file) {
        return update(file);
    }

    @Override
    public DataWrapper<List<TFileEntity>> findByType(Integer type) {
        DataWrapper<List<TFileEntity>> retDataWrapper = new DataWrapper<List<TFileEntity>>();
        List<TFileEntity> ret = new ArrayList<TFileEntity>();
        Session session = getSession();
        Criteria criteria = session.createCriteria(TFileEntity.class);
        if(type != null) {
            if(type<=6) {
                criteria.add(Restrictions.le("type", 6));
            }else{
                criteria.add(Restrictions.eq("type", type));
            }
        }
        try {
            ret = criteria.list();
        }catch (Exception e){
            System.out.println(e);
        }
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }

    @Override
    public TFileEntity getFileById(Long id) {
        return get(id);
    }

    @Override
    public List<TFileEntity> getFileByIds(String ids) {
        List<TFileEntity> list = null;
        String sql = "select {f.*} "
                + "from t_file f "
                + "where f.id in " + ids;
        Session session = getSession();
        Query query = session.createSQLQuery(sql)
                .addEntity("n",TNewsEntity.class)
                .addEntity("c",TFileEntity.class);
        try {
            list = query.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


}
