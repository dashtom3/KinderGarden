package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TFileDao;
import cn.jiang.garden.DAO.TMenuDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TMenuEntity;
import cn.jiang.garden.service.TMenuService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
@Service("tMenuService")
public class TMenuServiceImpl implements TMenuService{
    @Autowired
    TMenuDao tMenuDao;
    @Autowired
    TFileDao tFileDao;
    @Autowired
    TTokenDao tokenDao;

    @Override
    public DataWrapper<Void> updateMenu(TMenuEntity tMenu, String tokenString) {
        boolean result = tMenuDao.updateTMenu(tMenu);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }

//    @Override
//    public DataWrapper<Void> addMenuItem(TFileEntity tFile  , String tokenString) {
//        // TODO: 16/5/31  图片存储
//        boolean result = tFileDao.addFile(tFile);
//        DataWrapper<Void> data = new DataWrapper<Void>();
//        if(result == true){
//            return data;
//        }
//        data.setErrorCode(ErrorCodeEnum.Error);
//        return data;
//    }

//    @Override
//    public DataWrapper<Void> updateMenuItem(TFileEntity tFile, String tokenString) {
//        boolean result = tFileDao.updateFile(tFile);
//        DataWrapper<Void> data = new DataWrapper<Void>();
//        if(result == true){
//            return data;
//        }
//        data.setErrorCode(ErrorCodeEnum.Error);
//        return data;
//    }

    @Override
    public DataWrapper<List<TMenuEntity>> getMenuList(Integer type,Integer timeType,String tokenString){
        return tMenuDao.getTMenuListByType(type,timeType);
    }

//    @Override
//    public DataWrapper<Void> deleteMenuItem(Long itemId, String tokenString){
//        boolean result = tFileDao.deleteFile(itemId);
//        DataWrapper<Void> data = new DataWrapper<Void>();
//        if(result == true){
//            return data;
//        }
//        data.setErrorCode(ErrorCodeEnum.Error);
//        return data;
//    }
    @Override
    public DataWrapper<List<TFileEntity>> getMenuItemList(String tokenString){
        return tFileDao.findByType(7);
    }

    @Override
    public DataWrapper<Void> deleteMenu(Long menuId, String tokenString) {
        boolean result = tMenuDao.deleteTMenu(menuId);
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(result == true){
            return data;
        }
        data.setErrorCode(ErrorCodeEnum.Error);
        return data;
    }

    @Override
    public DataWrapper<Void> addMenu(TMenuEntity menuEntity, String tokenString) {
        TMenuEntity existedMenu = tMenuDao.getByTypeAndImgId(menuEntity.getType(),menuEntity.getTimeType(),menuEntity.getImgId());
        DataWrapper<Void> data = new DataWrapper<Void>();
        if(existedMenu == null) {
            menuEntity.setId(null);
            boolean result = tMenuDao.addTMenu(menuEntity);
            if(!result) {
                data.setErrorCode(ErrorCodeEnum.Error.Error);
            }
        } else {
            data.setErrorCode(ErrorCodeEnum.Error.Error);
        }
        return  data;
    }
}
