package com.sjy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjy.dao.NewMapper;
import com.sjy.model.New;
import com.sjy.service.INewService;
@Service
public class NewService implements INewService{

	@Autowired
	private NewMapper dao;
	@Override
	public New selectByPrimaryKey(int id) {		
		return dao.selectByPrimaryKey(id);
	}
	@Override
	public int deleteByPrimaryKey(Integer newsid) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(newsid);
	}
	@Override
	public int insert(New news) {
		// TODO Auto-generated method stub
		return dao.insert(news);
	}
	@Override
	public int updateByPrimaryKey(New news) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(news);
	}
	@Override
	public int updateByPrimaryKeySelective(New news) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(news);
	}
	@Override
	public List<New> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public int insertSelective(New news) {
		// TODO Auto-generated method stub
		return dao.insertSelective(news);
	}

}
