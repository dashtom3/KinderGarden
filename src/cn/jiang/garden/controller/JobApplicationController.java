package cn.jiang.garden.controller;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.service.JobApplicationService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="api/")
public class JobApplicationController {
    @Autowired
    FileService fileService;

    @Autowired
    JobApplicationService jobApplicationService;

    @RequestMapping(value="addJobApplication",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addJobApplication(
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
        jobApplicationEntity.setImgId(photoEntity.getId() == null ? 11 : photoEntity.getId());
        jobApplicationEntity.setFileId(resumeEntity.getId() == null ? 11 : resumeEntity.getId());
        return  jobApplicationService.addJobApplication(token, jobApplicationEntity);
    }

    @RequestMapping(value="getJobApplicationList",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<List<TJobApplicationEntity>> getJobApplicationList(
            @RequestParam(value = "token",required = false) String token
    ){
        return  jobApplicationService.getJobApplicationList(token);
    }

    @RequestMapping(value="deleteJobApplicationList/{jobApplicationId}",method = RequestMethod.DELETE)
    @ResponseBody
    public DataWrapper<Void> deleteJobApplicationList(
            @PathVariable("jobApplicationId") Long jobApplicationId,
            @RequestParam(value = "token",required = false) String token
    ){
        return  jobApplicationService.deleteJobApplication(token,jobApplicationId);
    }

}
