package cn.jiang.garden.controller;


import cn.jiang.garden.service.UserService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="api/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="login",method= RequestMethod.GET)
    @ResponseBody
    public DataWrapper<Void> login(
            @RequestParam(value="userName",required=true) String userName,
            @RequestParam(value = "password",required=true) String password
    ) {
        return userService.login(userName,password);
    }

}
