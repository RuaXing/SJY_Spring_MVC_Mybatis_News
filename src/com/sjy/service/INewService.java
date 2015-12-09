package com.sjy.service;

import java.util.List;

import com.sjy.model.New;

public interface INewService {

	public New selectByPrimaryKey(int id);
	public int deleteByPrimaryKey(Integer newsid);
	public int insert(New news);
	public int updateByPrimaryKey(New news);
	public int updateByPrimaryKeySelective(New news);
	public List<New> findAll();
	public  int insertSelective(New news);
}
