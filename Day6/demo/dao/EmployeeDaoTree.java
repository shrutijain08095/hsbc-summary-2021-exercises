package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;

public interface EmployeeDaoTree  {
	public void saveTree(Employee employee)throws EmployeeAlreadyExistsException;
	public Employee fetchEmployeeByIdTree(int id) throws EmployeeNotFoundException;
	public Set<Employee> findAllEmployeesTree();
	
	public void updateEmployeeTree(int id2, Employee employee)throws EmployeeNotFoundException;
	
	
}
