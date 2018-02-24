package com.yyc.f_jdbc.c_dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDbcp {

	@Test
	public void demo() {
		String xml = "com/yyc/f_jdbc/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
	
		//获得目标类
		UserDao dao = (UserDao) applicationContext.getBean("userDao");
		dao.update();
	}
}
