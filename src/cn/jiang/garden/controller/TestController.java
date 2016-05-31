package cn.jiang.garden.controller;

import cn.jiang.garden.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="api/")
public class TestController {
    @Autowired
    FileService fileService;
    @RequestMapping(value="login",method= RequestMethod.GET)
    @ResponseBody
    public DataWrapper<Void> login(
            @RequestParam(value="userName",required=true) String userName,
            @RequestParam(value = "password",required=true) String password
    ) {
        return userService.login(userName,password);
    }
}
