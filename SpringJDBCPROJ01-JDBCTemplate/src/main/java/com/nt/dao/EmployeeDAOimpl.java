package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


	@Repository("empDAO")
	public  class EmployeeDAOimpl implements IEmployeDAO
{
		public static final String GET_EMPS_COUNT="SELECT COUNT (*) FROM EMP"; 
@Autowired
private JdbcTemplate jt;  

@Override
	public int getEmlpyeeCount() {
		int count =jt.queryForObject(GET_EMPS_COUNT,Integer.class);
		return count;
	}

	
}