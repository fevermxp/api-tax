package com.gree.gree_x.dao;

import com.gree.gree_x.model.ImageFile;
import com.gree.gree_x.model.ImageFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageFileMapper {
    int countByExample(ImageFileExample example);

    int deleteByExample(ImageFileExample example);

    int insert(ImageFile record);

    int insertSelective(ImageFile record);

    List<ImageFile> selectByExampleWithBLOBs(ImageFileExample example);

    List<ImageFile> selectByExample(ImageFileExample example);

    int updateByExampleSelective(@Param("record") ImageFile record, @Param("example") ImageFileExample example);

    int updateByExampleWithBLOBs(@Param("record") ImageFile record, @Param("example") ImageFileExample example);

    int updateByExample(@Param("record") ImageFile record, @Param("example") ImageFileExample example);
}