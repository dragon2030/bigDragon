package com.bigDragon.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.bigDragon.demo.dao.TestDao;
import com.bigDragon.demo.entity.User;
import com.bigDragon.demo.service.TestService;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class TestServiceImpl implements TestService{

	@Autowired
	public TestDao testDao;
	
	@Override
	public int saveUser(User user){
		int num=0;
		try{
			num=testDao.saveUser(user);
//			List<String>list=new ArrayList<String>();
//			list.get(0);
		}catch(Exception e){
			num=999;
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return num;
	}
	
	@Override
	public List<Map<String,Object>> getUser(){
		List<Map<String,Object>> listMap=testDao.getUser();
		return listMap;
	}
	
	@Override
	public List<User> getUserMsg(){
		List<User> listMap=testDao.getUserMsg();
		return listMap;
	}
}
