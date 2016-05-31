package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TNewsDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.service.TNewsService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    @Override
    public DataWrapper<Void> addNews(TNewsEntity tnews, MultipartFile[] files,String tokenString){
        boolean result = tNewsDao.addTNews(tnews);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }
    @Override
    public DataWrapper<Void> updateNews(TNewsEntity tnews,MultipartFile[] files,String tokenString){
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
        return tNewsDao.getTNewsList();
    }
}