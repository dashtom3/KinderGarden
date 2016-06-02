package cn.jiang.garden.controller;

import cn.jiang.garden.model.TUserApplicationEntity;
import cn.jiang.garden.service.UserApplicationService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="api/userApplication")
public class UserApplicationController {
    @Autowired
    UserApplicationService userApplicationService;

    @RequestMapping(value="addUserApplication",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addUserApplication(
            @ModelAttribute TUserApplicationEntity userApplicationEntity
    ){
        return  userApplicationService.addUserApplication(userApplicationEntity);
    }

    @RequestMapping(value="deleteUserApplication/{userApplicationId}",method = RequestMethod.DELETE)
    @ResponseBody
    public DataWrapper<Void> deleteUserApplication(
            @PathVariable("userApplicationId") Long userApplicationId,
            @RequestParam(value = "token",required = false) String token
    ){
        return  userApplicationService.deleteUserApplication(userApplicationId,token);
    }

    @RequestMapping(value="updateUserApplication",method = RequestMethod.PUT)
    @ResponseBody
    public DataWrapper<Void> updateUserApplication(
            @ModelAttribute TUserApplicationEntity userApplicationEntity,
            @RequestParam(value = "token",required = false) String token
    ){
        return  userApplicationService.updateUserApplication(userApplicationEntity, token);
    }

    @RequestMapping(value="getUserApplicationList",method = RequestMethod.GET)
    @ResponseBody
    public DataWrapper<List<TUserApplicationEntity>> getUserApplicationList(
            @RequestParam(value = "state",required = false) Integer state,
            @RequestParam(value = "token",required = false) String token
    ){
        return  userApplicationService.getUserApplicationList(state, token);
    }

    @RequestMapping(value="getUserApplication/{userApplicationId}",method = RequestMethod.GET)
    @ResponseBody
    public DataWrapper<TUserApplicationEntity> getUserApplication(
            @PathVariable("userApplicationId") Long userApplicationId,
            @RequestParam(value = "token",required = false) String token
    ){
        return  userApplicationService.getUserApplication(userApplicationId,token);
    }
}
