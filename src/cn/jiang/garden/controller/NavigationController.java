package cn.jiang.garden.controller;

import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.model.TUserEntity;
import cn.jiang.garden.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;

@Controller
public class NavigationController {
    //Customer
    @RequestMapping(value="/home")
    public String mainPage(){
        return "../homepage";
    }
    @RequestMapping(value="/about")
    public String aboutPage(){
        return "../homepage";
    }
//    @RequestMapping(value="/news")
//    public String newsPage(){
//        return "../news";
//    }
    @RequestMapping(value = "/news/{id}")
    public String specificNewsPage(@PathVariable String id) {
        System.out.println("id: " + id);
        return "../specificNews";
    }

    @RequestMapping(value = "/news/publish")
    public String publishNewsPage() {
        return "../newsPublish";
    }
    @RequestMapping(value="/recruit")
    public String recruitPage(){
        return "../recruitment";
    }
    @RequestMapping(value="/jobView")
    public String jobViewPage(){
        return "../jobView";
    }
    @RequestMapping(value="/weeklymenu")
    public String weeklyMenuPage(){
        return "../weeklymenu";
    }
    //Manager
    @RequestMapping(value="/jobPublish")
    public String jobPublishPage(){
        return "../jobPublish";
    }
    @RequestMapping(value="/makeWeeklyMenu")
    public String makeWeeklyMenuPage(){
        return "../makeWeeklyMenu";
    }
}

