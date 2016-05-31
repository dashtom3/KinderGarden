package cn.jiang.garden.controller;

import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.model.TUserEntity;
import cn.jiang.garden.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;

@Controller
public class NavigationController {
    @RequestMapping(value="/home")
    public String mainPage(){
        return "../homepage";
    }
}

