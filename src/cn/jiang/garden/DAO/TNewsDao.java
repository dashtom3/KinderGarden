package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
public interface TNewsDao {
    boolean addTNews(TNewsEntity tnews);
    boolean deleteTNews(Long tnewsId);
    boolean updateTNews(TNewsEntity tnews);
    DataWrapper<List<TNewsEntity>> getTNewsList(int type);
    DataWrapper<TNewsEntity> getTNews(Long tNewsId);
    DataWrapper<TNewsEntity> getHomeData();
}
