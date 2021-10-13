package com.demo.dao;

import java.util.*;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;

public class EmployeeDaoTreeSetImpl implements EmployeeDao {
	Set<Employee> employeeset = new TreeSet<Employee>();

	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		employeeset.add(employee);
	}

	public Employee fetchEmployeeById(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		
		for(Employee t:employeeset) {
			if(t.getId()==id) {
				return t;
			}
			
		}
		return null;
	}

	public Employee[] findAllEmployees() {
		// TODO Auto-generated method stub
		Employee [] emp = (Employee[]) employeeset.toArray();
		return emp;
		
	}

	public void updateEmployeeTree(int id2, Employee employee) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		for(Employee t1 :employeeset ) {
			if(t1.getId()==id2) {
				t1=employee;
			}
		}
		
	}

	

	
	public void updateEmployee(int id2, Employee employee) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	
}
		
		
	

	