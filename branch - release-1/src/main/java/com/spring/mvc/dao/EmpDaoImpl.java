package com.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Emp> getEmployeesByPage(int pageid, int total) {
		String sql= "SELECT * FROM Employee_tbl LIMIT "+(pageid-1)+","+total;

		return getTemplate().query(sql, new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
				Emp emp = new Emp();
				emp.setId(rs.getInt("EMPLOYEE_ID"));
				emp.setName(rs.getString("EMPLOYEE_FULLNAME"));
				emp.setDesignation(rs.getString("EMPLOYEE_DESIGNATION"));
				emp.setSalary(rs.getInt("EMPLOYEE_SALARY"));

				return emp;
			}
		});
	}
}