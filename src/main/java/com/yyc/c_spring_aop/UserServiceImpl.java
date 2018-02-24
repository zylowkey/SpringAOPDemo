package com.yyc.c_spring_aop;

//实现类
public class UserServiceImpl implements UserService{

	public void addUser() {
		System.out.println("a_spring_aop   adduser");		
	}

	public void updateUser() {
		System.out.println("a_spring_aop   updateuser");
	}

	public void deleteUser() {
		System.out.println("a_spring_aop  deleteuser");
	}

}
