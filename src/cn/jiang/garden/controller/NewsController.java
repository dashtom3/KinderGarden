package cn.jiang.garden.controller;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.service.TNewsService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
@Controller
@RequestMapping(value="api/news")
public class NewsController {
    @Autowired
    TNewsService tNewsService;
    @Autowired
    FileService fileService;
    //添加新闻 api/news/addNews
    @RequestMapping(value="addNews",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addNews(
            @ModelAttribute TNewsEntity tNewsEntity,
            @RequestParam MultipartFile[] files,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
            for(int i=0;i<files.length;i++){
                TFileEntity file = new TFileEntity();
                file.setType(8);
            fileService.uploadFile(request,token,file,files[i]);
            if(i == 0){
                tNewsEntity.setImgId1(file.getId());
            }else if(i == 1){
                tNewsEntity.setImgId2(file.getId());
            }else{
                tNewsEntity.setImgId3(file.getId());
            }
        }
        return tNewsService.addNews(tNewsEntity,token);
    }
    //更新新闻 api/news/updateNews
    @RequestMapping(value="updateNews",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateNews(
            @ModelAttribute TNewsEntity tNewsEntity,
            @RequestParam MultipartFile[] files,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
            for(int i=0;i<files.length;i++){
                TFileEntity file = new TFileEntity();
                file.setType(8);
                fileService.uploadFile(request,token,file,files[i]);
                if(i == 0){
                    tNewsEntity.setImgId1(file.getId());
                }else if(i == 1){
                    tNewsEntity.setImgId2(file.getId());
                }else{
                    tNewsEntity.setImgId3(file.getId());
                }
            }
        return tNewsService.updateNews(tNewsEntity,token);
    }
    //删除新闻 api/news/deleteNews/{newsId}?token=x
    @RequestMapping(value="deleteNews/{newsId}",params = "token")
    @ResponseBody
    public DataWrapper<Void> deleteNews(
            @PathVariable("newsId") Long tnewsId,
            @RequestParam(value = "token",required = false) String token
    ){
        return tNewsService.deleteNews(tnewsId,token);
    }
    //新闻列表 api/news/getNewsList?token=x
    @RequestMapping(value="getNewsList",params = "token")
    @ResponseBody
    public DataWrapper<List<TNewsEntity>> getNewsList(
            @RequestParam(value = "token",required = false) String token
    ){
        return tNewsService.getNewsList(token);
    }
}
