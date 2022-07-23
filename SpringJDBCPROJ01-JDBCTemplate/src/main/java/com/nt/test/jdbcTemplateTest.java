package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.IEmployeDAO;

public class jdbcTemplateTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
				IEmployeDAO dao=ctx.getBean("empDAO",IEmployeDAO.class);
						int count = dao.getEmlpyeeCount();
		System.out.println("Employee count ="+count);

	}

}
