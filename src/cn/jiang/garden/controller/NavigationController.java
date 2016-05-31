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
    @Autowired
    TUserDao userDao;
    @RequestMapping(value="/home")
    public String mainPage(){
        TUserEntity user = new TUserEntity();
        user.setApplicationId(new Long(1));
        user.setPassword(MD5Util.getMD5String("123"));
        user.setType(0);
        user.setUserName("中文测试");
        user.setRegisterDate(new Date(System.currentTimeMillis()));
        boolean flag = userDao.addUser(user);

        System.out.print(flag);
        return "/index";
    }
}
