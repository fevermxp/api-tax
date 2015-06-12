package com.gree.gree_x.dao;

import com.gree.gree_x.model.DocImageFile;
import com.gree.gree_x.model.DocImageFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocImageFileMapper {
    int countByExample(DocImageFileExample example);

    int deleteByExample(DocImageFileExample example);

    int insert(DocImageFile record);

    int insertSelective(DocImageFile record);

    List<DocImageFile> selectByExample(DocImageFileExample example);

    int updateByExampleSelective(@Param("record") DocImageFile record, @Param("example") DocImageFileExample example);

    int updateByExample(@Param("record") DocImageFile record, @Param("example") DocImageFileExample example);
    
    int selectMaxId();
}