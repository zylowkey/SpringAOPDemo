package com.yyc.g_jdbcproperties;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yyc.f_jdbc.a_domain.User;

public class TestC3p0 {

	@Test
	public void demo() {
		String xml = "com/yyc/f_jdbc/applicationContext4.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
	
		//获得目标类
		UserDao dao = (UserDao) applicationContext.getBean("userDao");
		//dao.update();
		List<User> allUser = dao.findAll();
		for(User user:allUser){
			System.out.println(user);
		}
	}
}
