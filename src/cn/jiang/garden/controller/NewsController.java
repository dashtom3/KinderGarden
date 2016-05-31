package cn.jiang.garden.controller;

import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.service.TNewsService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by tia on 16/5/30.
 */
@Controller
@RequestMapping(value="api/news")
public class NewsController {
    @Autowired
    TNewsService tNewsService;
    //添加新闻 api/news/addNews
    @RequestMapping(value="addNews",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addNews(
            @ModelAttribute TNewsEntity tNewsEntity,
            @RequestParam MultipartFile[] files,
            @RequestParam(value = "token",required = false) String token
    ){
        return tNewsService.addNews(tNewsEntity,files,token);
    }
    //更新新闻 api/news/updateNews
    @RequestMapping(value="updateNews",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateNews(
            @ModelAttribute TNewsEntity tNewsEntity,
            @RequestParam MultipartFile files[],
            @RequestParam(value = "token",required = false) String token

    ){
        return tNewsService.updateNews(tNewsEntity,files,token);
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
