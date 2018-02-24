package com.yyc.f_jdbc.b_api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {

	public static void main(String[] args) {
		//1.创建数据原（链接池）dbcp
		BasicDataSource dataSource = new BasicDataSource();
		//基本4项
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testspring?useUnicode=true&characterEncoding=utf-8&useSSL=true";
		String username = "root";
		String password = "123456";
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		//2.创建模板
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		//3.通过api操作
		jdbcTemplate.update("insert into user(id,username,password) values (?,?,?);", 4,"孙","asdadf");
	}
}
