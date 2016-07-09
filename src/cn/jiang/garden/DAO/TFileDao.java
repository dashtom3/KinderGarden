package cn.jiang.garden.DAO;

import cn.jiang.garden.model.TFileEntity;
import cn.jiang.garden.utils.DataWrapper;

import java.util.List;


public interface TFileDao {
    boolean addFile(TFileEntity file);
    boolean deleteFile(Long fileId);
    boolean updateFile(TFileEntity file);
    DataWrapper<List<TFileEntity>> findByType(Integer type);
    TFileEntity getFileById(Long id);
    List<TFileEntity> getFileByIds(String ids);
}
