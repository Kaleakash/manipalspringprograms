package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public class LoginDao {

	@Autowired
	JdbcTemplate jt;
	
	public int storeLoginDetails(Login ll) {
		return jt.update("insert into login values(?,?)",ll.getName(),ll.getPass());
	}
	public List<Login> getLoginInfo() {
		return jt.query("select * from login", new MyRowMapper());
	}
	
}

class MyRowMapper implements RowMapper<Login>{
	@Override
	public Login mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Login ll = new Login();
		ll.setName(arg0.getString(1));
		ll.setPass(arg0.getString(2));
		return ll;
	}
	
}
