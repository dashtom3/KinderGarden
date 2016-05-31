package cn.jiang.garden.service;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TMenuEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.io.File;
import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
public interface TMenuService {
    DataWrapper<Void> updateMenu(TMenuEntity tMenu, String tokenString);
    DataWrapper<Void> addMenuItem(TFileEntity tFile, File file, String tokenString);
    DataWrapper<Void> updateMenuItem(TFileEntity tFile,File file,String tokenString);
    DataWrapper<Void> deleteMenuItem(Long itemId, String tokenString);
    DataWrapper<List<TMenuEntity>> getMenuList(String tokenString);
    DataWrapper<List<TFileEntity>> getMenuItemList(String tokenString);
}