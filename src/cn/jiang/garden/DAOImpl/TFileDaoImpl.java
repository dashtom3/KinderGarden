package cn.jiang.garden.DAOImpl;


import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TFileDao;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Criteria;
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
        return delete(get(fileId));
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
            criteria.add(Restrictions.eq("type", type));
        }
        try {
            ret = criteria.list();
        }catch (Exception e){
            System.out.println(e);
        }
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }


}
