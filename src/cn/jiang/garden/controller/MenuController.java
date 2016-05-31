package cn.jiang.garden.controller;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TMenuEntity;
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

    @RequestMapping(value="updateMenu",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateMenu(
            @ModelAttribute TMenuEntity tMenu,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
        return tMenuService.updateMenu(tMenu,token);
    }
    @RequestMapping(value="getMenuList",params = "token")
    @ResponseBody
    public DataWrapper<List<TMenuEntity>> getMenuList(
            @RequestParam(value = "token",required = false) String token){
        return tMenuService.getMenuList(token);
    }
    @RequestMapping(value="addMenuItem",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addMenuItem(
            @ModelAttribute TFileEntity tFile,
            @RequestParam File file,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
        return tMenuService.addMenuItem(tFile,file,token);
    }
    @RequestMapping(value="updateMenuItem",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateMenuItem(
            @ModelAttribute TFileEntity tFile,
            @RequestParam File file,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
        return tMenuService.updateMenuItem(tFile,file,token);
    }
    @RequestMapping(value="deleteMenuItem/{itemId}",params = "token")
    @ResponseBody
    public DataWrapper<Void> deleteMenuItem(
            @PathVariable("itemId") Long itemId,
            @RequestParam(value = "token",required = false) String token){
        return tMenuService.deleteMenuItem(itemId,token);
    }
    @RequestMapping(value="getMenuItemList",params = "token")
    @ResponseBody
    public DataWrapper<List<TFileEntity>> getMenuItemList(
            @RequestParam(value = "token",required = false) String token){
        return tMenuService.getMenuItemList(token);
    }
}
