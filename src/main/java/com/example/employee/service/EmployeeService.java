package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository eRepo;
	
	//get all records
	  public List<Employee> getAllEmployees(){
	   List<Employee> list =  (List<Employee>)eRepo.findAll();
	   return list;
	  }
	// get record by keyword
	 public List<Employee> getByKeyword(String keyword){
		  return eRepo.findByKeyword(keyword);
		 }

}
