package com.demo.dao;


import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class FactoryPattern {
	public static  EmployeeDao getDaoInstance(int factorychoice){
		if(factorychoice==1) {
			return new EmployeeDaoArrayImpl();
			
		}
		else{
			return new EmployeeDaoTreeSetImpl();
		}
		
			
		}
		
		
		
	public static EmployeeService getServiceInstance(EmployeeDao dao){
			
		return new EmployeeServiceImpl(dao);

	}
		
		
	

}
