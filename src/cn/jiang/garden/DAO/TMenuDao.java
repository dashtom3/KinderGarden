package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TMenuEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
public interface TMenuDao {
    boolean updateTMenu(TMenuEntity tMenu);
    DataWrapper<List<TMenuEntity>> getTMenuListByType(Integer type,Integer timeType);
    boolean deleteTMenu(Long id);
    boolean addTMenu(TMenuEntity tMenu);
    TMenuEntity getByTypeAndImgId(Integer type,Integer timeType,Long imgId);
}
