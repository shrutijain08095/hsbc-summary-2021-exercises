package com.demo.dao;

import java.util.*;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;

public class EmployeeDaoTreeSetImpl implements EmployeeDaoTree {
	Set<Employee> employeeset = new TreeSet<Employee>();

	public void saveTree(Employee employee) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		employeeset.add(employee);
	}

	public Employee fetchEmployeeByIdTree(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		Set<Employee> temp = new TreeSet<Employee>();
		
		temp=findAllEmployeesTree();
		for(Employee t:temp) {
			if(t.getId()==id) {
				return t;
			}
			
		}
		return null;
	}

	public Set<Employee> findAllEmployeesTree() {
		// TODO Auto-generated method stub
		return employeeset;
		
	}

	public void updateEmployeeTree(int id2, Employee employee) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Set<Employee> temp1=new TreeSet<Employee>();
		temp1=findAllEmployeesTree();
		for(Employee t1 :temp1 ) {
			if(t1.getId()==id2) {
				t1=employee;
			}
		}
		
	}
	
	
}
		
		
	

	