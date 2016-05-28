package cn.jiang.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tia on 16/5/28.
 */
@Controller
public class NavigationController {
    @RequestMapping(value="/home")
    public String mainPage(){
        return "/index";
    }
}
