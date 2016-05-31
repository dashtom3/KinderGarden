package cn.jiang.garden.controller;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TMenuEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.service.TMenuService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
@Controller
@RequestMapping(value="api/menu")
public class MenuController {
    @Autowired
    TMenuService tMenuService;
    @Autowired
    FileService fileService;
    //更新菜单 api/menu/updateMenu 只传图片id
    @RequestMapping(value="updateMenu",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateMenu(
            @ModelAttribute TMenuEntity tMenu,
            @RequestParam(value = "token",required = false) String token){
        return tMenuService.updateMenu(tMenu,token);
    }
    //得到菜单列表 api/menu/getMenuList?token = x
    @RequestMapping(value="getMenuList",params = "token")
    @ResponseBody
    public DataWrapper<List<TMenuEntity>> getMenuList(
            @RequestParam(value = "token",required = false) String token){
        return tMenuService.getMenuList(token);
    }
    //添加菜品 api/menu/addMenuItem
    @RequestMapping(value="addMenuItem",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addMenuItem(
            @ModelAttribute TFileEntity tFile,
            @RequestParam MultipartFile file,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
        tFile.setType(7);
        fileService.uploadFile(request,token,tFile,file);
        return tMenuService.addMenuItem(tFile,token);
    }
    //更新菜品 api/menu/updateMenuItem
    @RequestMapping(value="updateMenuItem",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateMenuItem(
            @ModelAttribute TFileEntity tFile,
            @RequestParam MultipartFile file,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
        tFile.setType(7);
        fileService.uploadFile(request,token,tFile,file);
        return tMenuService.updateMenuItem(tFile,token);
    }
    //删除菜品 api/menu/deleteMenuItem/{itemId}?token=x
    @RequestMapping(value="deleteMenuItem/{itemId}",params = "token")
    @ResponseBody
    public DataWrapper<Void> deleteMenuItem(
            @PathVariable("itemId") Long itemId,
            @RequestParam(value = "token",required = false) String token){
        return tMenuService.deleteMenuItem(itemId,token);
    }
    //得到菜品列表 api/menu/getMenuItemList?token = x (type = 1~7:周一~周日 name:星期几 image:菜品的名字简介在json image类中)
    @RequestMapping(value="getMenuItemList",params = "token")
    @ResponseBody
    public DataWrapper<List<TFileEntity>> getMenuItemList(
            @RequestParam(value = "token",required = false) String token){
        return tMenuService.getMenuItemList(token);
    }
}
