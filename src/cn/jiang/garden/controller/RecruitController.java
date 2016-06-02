package cn.jiang.garden.controller;

import cn.jiang.garden.model.TRecruitEntity;
import cn.jiang.garden.service.TRecruitService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tia on 16/5/31.
 */
@Controller
@RequestMapping(value="api/recruit")
public class RecruitController {
    @Autowired
    TRecruitService tRecruitService;
    //发布招聘 api/recruit/addRecruit  state 1发布0不发布 已测，注意日期
    @RequestMapping(value="addRecruit",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addRecruit(
            @ModelAttribute TRecruitEntity tRecruitEntity,
            @RequestParam(value = "token",required = false) String token
    ){
        return tRecruitService.addTRecruit(tRecruitEntity,token);
    }
    //更新招聘 api/recruit/updateRecruit 已测
    @RequestMapping(value="updateRecruit",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateRecruit(
            @ModelAttribute TRecruitEntity tRecruitEntity ,
            @RequestParam(value = "token",required = false) String token

    ){
        return tRecruitService.updateTRecruit(tRecruitEntity,token);
    }
    //删除招聘 api/recruit/deleteRecruit/{recruitId}?token=x 已测
    @RequestMapping(value="deleteRecruit/{recruitId}",params = "token")
    @ResponseBody
    public DataWrapper<Void> deleteNews(
            @PathVariable("recruitId") Long recruitId,
            @RequestParam(value = "token",required = false) String token
    ){
        return tRecruitService.deleteTRecruit(recruitId,token);
    }
    //招聘列表 api/recruit/getRecruitList?token=x  包含所有状态 已测
    @RequestMapping(value="getRecruitList",params = "token")
    @ResponseBody
    public DataWrapper<List<TRecruitEntity>> getNewsList(
            @RequestParam(value = "token",required = false) String token
    ){
        return tRecruitService.getTRecruitList(token);
    }
}
