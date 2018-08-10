package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	@Autowired
	DataSource ds;
	
	@Autowired
	JdbcTemplate jt;
	
	public int insertEmp(int id, String name, float salary) {
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "system", "Welcome123");
	
			
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setFloat(3, salary);
			int res = pstmt.executeUpdate();
	
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return 0;
	}
//JdbcTempalte with Database 
	//Insert Record 
	public int insertJdbcTemplate(int id, String name, float salary) {
		return jt.update("insert into employee values(?,?,?)", id,name,salary);
		}
	
	public int deleteJdbcTemplate(int id) {
		return jt.update("delete from employee where id=?", id);
		}
	
	public int updateJdbcTemplate(int id, float salary) {
		return jt.update("update employee set salary = salary+? where id = ?",salary,id);
	}
	
	
	public List<Employee> getEmployeeInfo() {
		//return jt.query("select * from employee", new MyResultSetExtractor());
		return jt.query("select * from employee", new MyRowMapper());
	}
	
}



class MyRowMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(arg0.getInt(1));
		emp.setName(arg0.getString(2));
		emp.setSalary(arg0.getFloat(3));
		return emp;
	}
}

class MyResultSetExtractor implements ResultSetExtractor<List<Employee>>{

	@Override
	public List<Employee> extractData(ResultSet arg0) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<Employee> listOfemp = new ArrayList<Employee>();
		
		while(arg0.next()) {
			Employee emp = new Employee();
			emp.setId(arg0.getInt(1));
			emp.setName(arg0.getString(2));
			emp.setSalary(arg0.getFloat(3));
			
			listOfemp.add(emp);
		}
		
		return listOfemp;
	}
	
}





