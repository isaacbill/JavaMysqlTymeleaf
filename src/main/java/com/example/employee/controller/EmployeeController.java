package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	 @Autowired
	 private EmployeeService service;
	 @RequestMapping(path = {"/","/search"})
	 public String home(Employee employee, Model model, String keyword) {
	  if(keyword!=null) {
	   List<Employee> list = service.getByKeyword(keyword);
	   model.addAttribute("list", list);
	  }else {
	  List<Employee> list = service.getAllEmployees();
	  model.addAttribute("list", list);}
	  return "index";
	 }

}
