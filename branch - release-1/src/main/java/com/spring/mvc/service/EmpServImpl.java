package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.EmpDao;
import com.spring.mvc.model.Emp;

@Service
public class EmpServImpl implements EmpServ {

	@Autowired
	private EmpDao edao;

	public List<Emp> getEmployeesByPage(int pageid, int total) {
		return edao.getEmployeesByPage(pageid, total);
	}
}