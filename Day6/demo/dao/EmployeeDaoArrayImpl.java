package com.demo.dao;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;

import java.util.*;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;
	
	public void save(Employee employee) throws EmployeeAlreadyExistsException{
		int id=employee.getId();
		Employee[] temp = findAllEmployees();
		for(Employee employee1:temp)
			
			if(employee1.getId()==id) {
			
				throw new EmployeeAlreadyExistsException("Employee already exists");
		} 
		employeeDb[arrayIndexCounter] = employee;
		arrayIndexCounter++;
	}
	
	public Employee fetchEmployeeById(int id) throws EmployeeNotFoundException{
		for(Employee e:employeeDb) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}
	public Employee[] findAllEmployees() {
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for(int index = 0; index < arrayIndexCounter; index++) {
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}
	
		
	
	public void updateEmployee(int id2 ,Employee employee) {
		Employee[] employee1 = findAllEmployees();
		for( Employee e2:employee1) {
			if(e2.getId()==id2) {
				e2=employee;
				
			}
		}
			
		
		
			
			
	}
	
	
	
	
	
}