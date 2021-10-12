package com.demo.dao;


import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class FactoryPattern {
	public static EmployeeDao getDaoInstance(){
		
		return new EmployeeDaoArrayImpl();}
		
	public static EmployeeService getServiceInstance(){
			
		return new EmployeeServiceImpl();

	}
		
		
	

}
