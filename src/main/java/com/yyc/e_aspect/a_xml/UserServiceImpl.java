package com.yyc.e_aspect.a_xml;

//实现类
public class UserServiceImpl implements UserService{

	public void addUser() {
		System.out.println("a_aspect_xml   adduser");		
	}

	public String updateUser() {
		System.out.println("a_aspect_xml   updateuser");
		return "aasdfghjkl";
		
	}

	public void deleteUser() {
		System.out.println("a_aspect_xml  deleteuser");
	}

}
