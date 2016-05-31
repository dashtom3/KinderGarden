package cn.jiang.garden.serviceImpl;

import cn.jiang.garden.DAO.TFileDao;
import cn.jiang.garden.DAO.TTokenDao;
import cn.jiang.garden.enums.ErrorCodeEnum;
import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.model.TTokenEntity;
import cn.jiang.garden.service.FileService;
import cn.jiang.garden.utils.DataWrapper;
import cn.jiang.garden.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;


@Service("fileService")
public class FileServiceImpl implements FileService {
    @Autowired
    TTokenDao tokenDao;

    @Autowired
    TFileDao fileDao;


    @Override
    public DataWrapper<TFileEntity> uploadFile(HttpServletRequest request,String token,TFileEntity fileEntity, MultipartFile file) {
        TTokenEntity tokenEntity = tokenDao.findByTokenString(token);
        DataWrapper<TFileEntity> retDataWrapper = new DataWrapper<TFileEntity>();
        if(tokenEntity != null && fileEntity != null && fileEntity.getType() != null) {
            String filePath = request.getSession().getServletContext().getRealPath("/") + "upload";
            String newFileName = MD5Util.getMD5String(file.getName() + tokenEntity.getUserId() + new Date()).replace(".","")
                     + file.getOriginalFilename().substring(file.getName().lastIndexOf(".") + 1);

            System.out.println(filePath);
            System.out.println(file.getOriginalFilename());
            File fileDir = new File(filePath);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }

            try {
                FileOutputStream out = new FileOutputStream(filePath + "\\"
                        + newFileName);
                // 写入文件
                out.write(file.getBytes());
                out.flush();
                out.close();
                fileEntity.setImgSrc(  "upload/"
                        + newFileName);
                fileDao.addFile(fileEntity);
                retDataWrapper.setData(fileEntity);
            } catch (Exception e) {
                e.printStackTrace();
                retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
            }

        } else {
            retDataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return retDataWrapper;
    }
}