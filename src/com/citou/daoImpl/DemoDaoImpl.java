package com.citou.daoImpl;

import org.springframework.stereotype.Repository;

import com.citou.dao.DemoDao;

@Repository
public class DemoDaoImpl implements DemoDao {

	@Override
	public String getResult() {
	
		//TODO:这里添加访问数据库的逻辑
		return "this a example of ajax get";
	}
}
