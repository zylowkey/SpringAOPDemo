package com.yyc.b_factoryBean;

//实现类
public class UserServiceImpl implements UserService{

	public void addUser() {
		System.out.println("a_factory_bean   adduser");		
	}

	public void updateUser() {
		System.out.println("a_factory_bean   updateuser");
	}

	public void deleteUser() {
		System.out.println("a_factory_bean  deleteuser");
	}

}
