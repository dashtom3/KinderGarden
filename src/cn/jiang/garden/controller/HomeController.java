package cn.jiang.garden.controller;

import cn.jiang.garden.enums.ErrorCodeEnum;
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

/**
 * Created by tia on 16/5/31.
 */
@Controller
@RequestMapping(value="api/home")
public class HomeController {
    @Autowired
    TNewsService tNewsService;
    @Autowired
    FileService fileService;
    //得到主页数据 api/home/getHomeData?token = x
    @RequestMapping(value="getHomeData")
    @ResponseBody
    public DataWrapper<TNewsEntity> getHomeData(
            @RequestParam(value = "token",required = false) String token){
        return tNewsService.getHomeData(token);
    }
    //修改横幅 api/home/updateHomeHeader
    @RequestMapping(value="updateHomeHeader",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateHomeHeader(
            @RequestParam MultipartFile[] files,
            @ModelAttribute TNewsEntity tNewsEntity,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
        if(files != null) {
            for (int i = 0; i < files.length; i++) {
                TFileEntity file = new TFileEntity();
                file.setType(8);
                fileService.uploadFile(request, token, file, files[i]);
                if (i == 0) {
                    tNewsEntity.setImgId1(file.getId());
                } else if (i == 1) {
                    tNewsEntity.setImgId2(file.getId());
                } else {
                    tNewsEntity.setImgId3(file.getId());
                }
            }
        }
        return tNewsService.updateNews(tNewsEntity,token);
    }
    //修改单个图片信息 api/home/updateHomePic   对应主页的1~6张图片 旁边的描述为tFileEntity 中的name 和 intro
    @RequestMapping(value="updateHomePic",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateHomePic(
            @ModelAttribute TFileEntity tFileEntity,
            @RequestParam MultipartFile file,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request) throws IOException {
        if(tFileEntity.getType() != null) {
            if (tFileEntity.getType() <= 6) {
                return fileService.updateFile(request, token, tFileEntity, file);
            }
        }
        DataWrapper<Void> ret = new DataWrapper<Void>();
        ret.setErrorCode(ErrorCodeEnum.Error);
        return ret;
    }
}
