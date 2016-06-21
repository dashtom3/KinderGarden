package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TFileDao;
import cn.jiang.garden.DAO.TNewsDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.service.TNewsService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
@Service("tNewsService")
public class TNewsServiceImpl implements TNewsService {
    @Autowired
    TNewsDao tNewsDao;

    @Autowired
    TTokenDao tokenDao;

    @Autowired
    TFileDao tFileDao;

    @Override
    public DataWrapper<Void> addNews(TNewsEntity tnews,String tokenString){
        tnews.setPublishDate(new Date(System.currentTimeMillis()));
        boolean result = tNewsDao.addTNews(tnews);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }
    @Override
    public DataWrapper<Void> updateNews(TNewsEntity tnews,String tokenString){
        boolean result = tNewsDao.updateTNews(tnews);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }
    @Override
    public DataWrapper<Void> deleteNews(Long tnewsId,String tokenString){
        boolean result = tNewsDao.deleteTNews(tnewsId);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }

    @Override
    public DataWrapper<List<TNewsEntity>> getNewsList(String tokenString){
        return tNewsDao.getTNewsList(1);
    }

    @Override
    public DataWrapper<TNewsEntity> getNewsById(Long newsId, String tokenString) {
        return tNewsDao.getTNews(newsId);
    }


    @Override
    public DataWrapper<TNewsEntity> getHomeData(String tokenString) {
        TNewsEntity result = tNewsDao.getHomeData().getData();
        //添加主页图片
        result.setHomePic(tFileDao.findByType(6).getData());
        DataWrapper<TNewsEntity> ret = new DataWrapper<TNewsEntity>();
        ret.setData(result);
        return ret;
    }
}
