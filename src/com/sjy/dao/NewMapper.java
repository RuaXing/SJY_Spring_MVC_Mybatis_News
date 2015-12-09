package com.sjy.dao;

import java.util.List;

import com.sjy.model.New;

public interface NewMapper {
    int deleteByPrimaryKey(Integer newsid);

    int insert(New record);

    int insertSelective(New record);

    New selectByPrimaryKey(Integer newsid);
 
    List<New> findAll();
    
    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKey(New record);
}