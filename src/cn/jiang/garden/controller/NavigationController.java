package cn.jiang.garden.controller;

import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.model.TUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {
//    @Autowired
//    TUserDao userDao;
    @RequestMapping(value="/home")
    public String mainPage(){
//        TUserEntity tt = new TUserEntity();
//        tt.setApplicationId(1);
//        tt.setPassword("123");
//        tt.setType(0);
//        tt.setUserName("prf");
//        boolean flag = userDao.addUser(tt);
//
//        System.out.print(flag);
        return "/index";
    }
}
