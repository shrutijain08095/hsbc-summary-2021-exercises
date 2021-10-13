package com.demo.dao;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	public void save(Employee employee)throws EmployeeAlreadyExistsException;
	public Employee fetchEmployeeById(int id) throws EmployeeNotFoundException;
	public Employee[] findAllEmployees();
	
	public void updateEmployee(int id2, Employee employee)throws EmployeeNotFoundException;
	
	
}