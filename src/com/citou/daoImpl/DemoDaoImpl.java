package com.citou.daoImpl;

import org.springframework.stereotype.Repository;

import com.citou.dao.DemoDao;

@Repository
public class DemoDaoImpl implements DemoDao {

	@Override
	public String getResult() {
	
		//TODO:������ӷ������ݿ���߼�
		return "this a example of ajax get";
	}
}
