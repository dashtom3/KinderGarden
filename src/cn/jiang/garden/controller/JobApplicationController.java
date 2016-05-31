package cn.jiang.garden.controller;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="api/")
public class JobApplicationController {
    @Autowired
    FileService fileService;


    @RequestMapping(value="jobApplication",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addNews(
            @ModelAttribute TJobApplicationEntity jobApplicationEntity,
            @RequestParam(value = "photo", required = true) MultipartFile photo,
            @RequestParam(value = "resume", required = true) MultipartFile resume,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request
    ){
        TFileEntity photoEntity = new TFileEntity();
        TFileEntity resumeEntity = new TFileEntity();
        photoEntity.setType(10);
        photoEntity.setId(null);
        resumeEntity.setType(9);
        resumeEntity.setId(null);
        fileService.uploadFile(request,token,photoEntity,photo);
        fileService.uploadFile(request,token,resumeEntity,resume);
        jobApplicationEntity.setImgId(null);
        jobApplicationEntity.setFileId(null);
        return  null;
    }

}
