package cn.jiang.garden.controller;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TJobApplicationEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.service.JobApplicationService;
import cn.jiang.garden.utils.BaseUtil;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="api/jobApplication")
public class JobApplicationController {
    @Autowired
    FileService fileService;

    @Autowired
    JobApplicationService jobApplicationService;

    //投递简历  api/jobApplication/addJobApplication    POST
    /*
    name      String
    sex       Integer   1 man   0 male
    education String
    address   String
    tel       String
    mail      String
    birthDay  Date
    photo     图片文件
    resume    简历文件
     */
    @RequestMapping(value="addJobApplication",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addJobApplication(
            @ModelAttribute TJobApplicationEntity jobApplicationEntity,
            @RequestParam(value = "photo", required = false) MultipartFile photo,
            @RequestParam(value = "resume", required = false) MultipartFile resume,
            HttpServletRequest request
    ){
        return  jobApplicationService.addJobApplication( jobApplicationEntity,photo,resume,request);
    }

    //管理员查看简历  api/jobApplication/getJobApplicationList?token=    GET
    @RequestMapping(value="getJobApplicationList",method = RequestMethod.GET)
    @ResponseBody
    public DataWrapper<List<TJobApplicationEntity>> getJobApplicationList(
            @RequestParam(value = "token",required = false) String token
    ){
        return  jobApplicationService.getJobApplicationList(token);
    }

    //管理员删除简历  api/jobApplication/deleteJobApplication/{jobApplicationId}?token=    DELETE
    @RequestMapping(value="deleteJobApplication/{jobApplicationId}",method = RequestMethod.DELETE)
    @ResponseBody
    public DataWrapper<Void> deleteJobApplicationList(
            @PathVariable("jobApplicationId") Long jobApplicationId,
            @RequestParam(value = "token",required = false) String token,
            HttpServletRequest request
    ){
        return  jobApplicationService.deleteJobApplication(token,jobApplicationId,request);
    }

}
