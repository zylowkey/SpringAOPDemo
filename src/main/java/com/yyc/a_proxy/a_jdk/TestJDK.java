package com.yyc.a_proxy.a_jdk;

import org.junit.Test;

public class TestJDK {

	@Test
	public void test(){
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}	
	
}
