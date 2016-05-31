package cn.jiang.garden.DAOImpl;

import cn.jiang.garden.DAO.BaseDao;
import cn.jiang.garden.DAO.TJobApplicationDao;
import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/5/31.
 */
@Repository
public class TJobApplicationDaoImpl extends BaseDao<TJobApplicationEntity> implements TJobApplicationDao {
    @Override
    public boolean addJobApplication(TJobApplicationEntity jobApplication) {
        return save(jobApplication);
    }

    @Override
    public DataWrapper<List<TJobApplicationEntity>> getJobApplicationList() {
        DataWrapper<List<TJobApplicationEntity>> retDataWrapper = new DataWrapper<List<TJobApplicationEntity>>();
        List<TJobApplicationEntity> ret;

        String sql = "select jobApplication.id as id,"
                + "jobApplication.name as name,"
                + "jobApplication.sex as sex,"
                + "jobApplication.birth as birth,"
                + "jobApplication.education as education," +
                "jobApplication.address as address," +
                "jobApplication tel as tel," +
                "jobApplication.mail as mail," +
                "(select img_src from t_file where id = jobApplication.file_id) as file_src," +
                "(select img_src from t_file where id = jobApplication.img_id) as img_src "
                + "from t_job_application jobApplication "
                + "order by jobApplication.id desc";
        Session session = getSession();
        Query query = session.createSQLQuery(sql)
                .addScalar("id", StandardBasicTypes.LONG)
                .addScalar("name", StandardBasicTypes.STRING)
                .addScalar("sex", StandardBasicTypes.INTEGER)
                .addScalar("birth", StandardBasicTypes.DATE)
                .addScalar("education", StandardBasicTypes.STRING)
                .addScalar("address", StandardBasicTypes.STRING)
                .addScalar("tel", StandardBasicTypes.STRING)
                .addScalar("mail", StandardBasicTypes.STRING)
                .addScalar("file_src", StandardBasicTypes.STRING)
                .addScalar("img_src", StandardBasicTypes.STRING)
                .setResultTransformer(Transformers.aliasToBean(TJobApplicationEntity.class));

        ret = query.list();
        retDataWrapper.setData(ret);
        return retDataWrapper;
    }

    @Override
    public boolean deleteJobApplication(Long jobApplicationId) {
        return delete(get(jobApplicationId));
    }
}