package com.yyc.g_jdbcdaosupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.runners.Parameterized;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yyc.f_jdbc.a_domain.User;

public class UserDao extends JdbcDaoSupport{


	public void update(){
		String sql = "insert into user(username,password) values (?,?);";
		Object[] args = {"周","zhou"};
		this.getJdbcTemplate().update(sql, args);
	}
	
	//查询所有
	public List<User> findAll() {
		String sql = "select * from user";
		return this.getJdbcTemplate().query(sql, new ItemMapper());
	}
	
}

class ItemMapper implements RowMapper{


	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	
}