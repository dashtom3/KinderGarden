package cn.jiang.garden.controller;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="api/")
public class TestController {
    @Autowired
    FileService fileService;
    @RequestMapping(value="test",method= RequestMethod.POST)
    @ResponseBody
    public DataWrapper<TFileEntity> login(

            @RequestParam(value = "photo", required = false) MultipartFile file,
            HttpServletRequest request
    ) {
        TFileEntity fileEntity = new TFileEntity();
        fileEntity.setType(8);
        fileEntity.setId(null);
        fileEntity.setName("test");
         fileService.uploadFile(request,null,fileEntity,file);
        System.out.println(fileEntity.getId());
        return null;
    }
}
