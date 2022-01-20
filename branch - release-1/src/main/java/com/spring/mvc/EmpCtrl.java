package com.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Emp;
import com.spring.mvc.service.EmpServ;

@Controller
public class EmpCtrl {

	@Autowired
	EmpServ eserv;

	@RequestMapping(value= "/init/{page_id}", method= RequestMethod.GET) 
	public ModelAndView paginate(@PathVariable int page_id) {		
		int total = 5;
		if(page_id == 1) {
			// do nothing!
		} else {			
			page_id= (page_id-1)*total+1;  
		}

		List<Emp> list = eserv.getEmployeesByPage(page_id, total);

		return new ModelAndView("welcome", "list", list);  
	}
}