package com.yyc.f_jdbc.c_dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

	//jdbc模板将由spring注入
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void update(){
		String sql = "insert into user(username,password) values (?,?);";
		Object[] args = {"李","li"};
		jdbcTemplate.update(sql, args);
	}
	
}
