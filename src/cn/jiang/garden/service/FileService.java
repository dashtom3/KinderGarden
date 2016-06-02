package cn.jiang.garden.service;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.utils.DataWrapper;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/5/31.
 */
public interface FileService {
    DataWrapper<Void> uploadFile(HttpServletRequest request,String token,TFileEntity fileEntity,MultipartFile file);
    DataWrapper<Void> deleteFile(Long id,String token,HttpServletRequest request);
    DataWrapper<Void> updateFile(HttpServletRequest request,String token,TFileEntity fileEntity,MultipartFile file);
}
