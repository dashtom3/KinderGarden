package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TRecruitEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by tia on 16/5/31.
 */
public interface TRecruitDao {
    boolean addTRecruit(TRecruitEntity tRecruit);
    boolean deleteTRecruit(Long tRecruitId);
    boolean updateTRecruit(TRecruitEntity tRecruit);
    DataWrapper<List<TRecruitEntity>> getTRecruitList();
    TRecruitEntity getTRecruit(Long tRecruitId);
}
