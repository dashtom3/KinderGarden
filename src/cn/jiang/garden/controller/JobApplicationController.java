package cn.jiang.garden.controller;

import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="api/")
public class JobApplicationController {
    @Autowired
    FileService fileService;


    @RequestMapping(value="jobApplication",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addNews(
            @ModelAttribute TJobApplicationEntity jobApplicationEntity,
            @RequestParam(value = "photo", required = true) MultipartFile file,
            @RequestParam(value = "token",required = false) String token
    ){
//        return tNewsService.addNews(tNewsEntity,files,token);
        return  null;
    }

}
