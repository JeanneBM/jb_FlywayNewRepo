package com.spring.mvc.dao;

import java.util.List;

import com.spring.mvc.model.Emp;

public interface EmpDao {

	public List<Emp> getEmployeesByPage(int pageid, int total);
}