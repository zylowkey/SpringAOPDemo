package com.yyc.a_proxy.b_cjlib;

import org.junit.Test;

public class TestCGLIB {

	@Test
	public void test(){
		UserServiceImpl userService = MyBeanFactory.createService();
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}	
	
}
