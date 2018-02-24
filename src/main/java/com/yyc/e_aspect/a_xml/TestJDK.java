package com.yyc.e_aspect.a_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDK {

	@Test
	public void test(){
		String xml = "com/yyc/e_aspect/a_xml/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		
		//获得目标类
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}	
	
}
