package com.spring.mvc.service;

import java.util.List;

import com.spring.mvc.model.Emp;

public interface EmpServ {

	public List<Emp> getEmployeesByPage(int pageid, int total);
}