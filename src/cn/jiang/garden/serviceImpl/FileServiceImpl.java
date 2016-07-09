package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TFileDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.DAO.TUserDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.utils.DataWrapper;
import cn.jiang.garden.utils.FileUtil;
import cn.jiang.garden.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.UUID;


@Service("fileService")
public class FileServiceImpl implements FileService {
    @Autowired
    TTokenDao tokenDao;

    @Autowired
    TFileDao fileDao;

    @Autowired
    TUserDao userDao;


    @Override
    public DataWrapper<Void> uploadFile(HttpServletRequest request,String token,TFileEntity fileEntity, MultipartFile file) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        if(fileEntity != null && fileEntity.getType() != null && file != null) {
            fileEntity.setId(null);
            String filePath = request.getSession().getServletContext().getRealPath("/") + "upload";
            String newFileName = MD5Util.getMD5String(file.getOriginalFilename() + new Date() + UUID.randomUUID().toString()).replace(".","")
                    + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

            File fileDir = new File(filePath);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            try {
                FileOutputStream out = new FileOutputStream(filePath + "/"
                        + newFileName);
                // 写入文件
                out.write(file.getBytes());
                out.flush();
                out.close();
                fileEntity.setImgSrc(  "upload/"
                        + newFileName);
                fileDao.addFile(fileEntity);
            } catch (Exception e) {
                e.printStackTrace();
                retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
            }

        } else {
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return retDataWrapper;
    }

    @Override
    public DataWrapper<Void> deleteFile(Long id,String token,HttpServletRequest request) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        TFileEntity fileEntity = fileDao.getFileById(id);
        if(fileEntity.getType() == 11) return retDataWrapper;//文件type为11的被认为是空文件
        String filePath = request.getSession().getServletContext().getRealPath("/") + fileEntity.getImgSrc();
        boolean deleteState1 = FileUtil.deleteFile(filePath);
        boolean deleteState2 = fileDao.deleteFile(id);
        if(deleteState1 && deleteState2) {
            retDataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
        } else retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return retDataWrapper;
    }

    @Override
    public DataWrapper<Void> updateFile(HttpServletRequest request,String token,TFileEntity fileEntity, MultipartFile file) {
        DataWrapper<Void> retDataWrapper = new DataWrapper<Void>();
        if(fileEntity.getType() == 11) return retDataWrapper;//文件type为11的被认为是空文件
        String fileToDelete = request.getSession().getServletContext().getRealPath("/") + fileEntity.getImgSrc();
        FileUtil.deleteFile(fileToDelete);

        String filePath = request.getSession().getServletContext().getRealPath("/") + "upload";
        String newFileName = MD5Util.getMD5String(file.getOriginalFilename() + new Date() + UUID.randomUUID().toString()).replace(".","")
                + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        File fileDir = new File(filePath);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }
        try {
            FileOutputStream out = new FileOutputStream(filePath + "/"
                    + newFileName);
            // 写入文件
            out.write(file.getBytes());
            out.flush();
            out.close();
            fileEntity.setImgSrc(  "upload/"
                    + newFileName);
            fileDao.updateFile(fileEntity);
        } catch (Exception e) {
            e.printStackTrace();
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return null;
    }
}
