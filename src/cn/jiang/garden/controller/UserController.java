package cn.jiang.garden.controller;


import cn.jiang.garden.model.TUserEntity;
import cn.jiang.garden.service.UserService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="api/user")
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

    @RequestMapping(value="register",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> register(
            @ModelAttribute TUserEntity userEntity,
            @RequestParam(value = "token",required=true) String token
    ) {
        return userService.register(userEntity,token);
    }

}
