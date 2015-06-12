package com.gree.gree_x.dao;

import com.gree.gree_x.model.SequenceIndex;
import com.gree.gree_x.model.SequenceIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceIndexMapper {
    int countByExample(SequenceIndexExample example);

    int deleteByExample(SequenceIndexExample example);

    int insert(SequenceIndex record);

    int insertSelective(SequenceIndex record);

    List<SequenceIndex> selectByExample(SequenceIndexExample example);

    int updateByExampleSelective(@Param("record") SequenceIndex record, @Param("example") SequenceIndexExample example);

    int updateByExample(@Param("record") SequenceIndex record, @Param("example") SequenceIndexExample example);
}