package cn.jiang.garden.service;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
public interface TNewsService {
    DataWrapper<Void> addNews(TNewsEntity tnews,String tokenString);
    DataWrapper<Void> updateNews(TNewsEntity tnews,String tokenString);
    DataWrapper<Void> deleteNews(Long tnewsId,String tokenString);
    DataWrapper<List<TNewsEntity>> getNewsList(String tokenString);
    DataWrapper<TNewsEntity> getNewsById(Long newsId,String tokenString);
    DataWrapper<TNewsEntity> getHomeData(String tokenString);
}
