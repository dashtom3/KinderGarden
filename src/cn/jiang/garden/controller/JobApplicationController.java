package cn.jiang.garden.controller;

import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.model.TNewsEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="api/")
public class JobApplicationController {
    @RequestMapping(value="jobApplication",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addNews(
            @ModelAttribute TJobApplicationEntity jobApplicationEntity,
            @RequestParam MultipartFile[] files,
            @RequestParam(value = "token",required = false) String token
    ){
        return tNewsService.addNews(tNewsEntity,files,token);
    }
}
