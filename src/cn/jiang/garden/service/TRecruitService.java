package cn.jiang.garden.service;

import cn.jiang.garden.model.TRecruitEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by tia on 16/5/31.
 */
public interface TRecruitService {
    DataWrapper<Void> addTRecruit(TRecruitEntity tRecruit, String tokenString);
    DataWrapper<Void> updateTRecruit(TRecruitEntity tRecruit,String tokenString);
    DataWrapper<Void> deleteTRecruit(Long tRecruitId,String tokenString);
    DataWrapper<List<TRecruitEntity>> getTRecruitList(String tokenString);
    DataWrapper<Void> changeTRecruitState(Long tRecruitId,int state,String tokenString);
}
