package com.demo.service;
import com.demo.exception.*;
import com.demo.beans.Employee;
import com.demo.exception.EmployeeAlreadyExistsException;

public interface EmployeeService {
	public void store(Employee employee)throws EmployeeAlreadyExistsException;
	public Employee findEmployee(int id) throws EmployeeNotFoundException;
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary)throws EmployeeNotFoundException;
	public void updateName(int id, String name) throws EmployeeNotFoundException ;

}