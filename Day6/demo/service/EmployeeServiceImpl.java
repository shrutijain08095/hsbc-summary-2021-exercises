package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoArrayImpl;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;


	

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;
	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = (EmployeeDao) FactoryPattern.getDaoInstance();
	}

	public void store(Employee employee) throws EmployeeAlreadyExistsException {
		dao.save(employee);
		
	}

	public Employee findEmployee(int id) throws EmployeeNotFoundException{
		Employee e1 = dao.fetchEmployeeById(id);
		if(e1 == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		return e1;
		
			
		
		
		
		
	}

	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	public void updateSalary(int id2, double salary2) throws EmployeeNotFoundException{
		
		Employee employee=dao.fetchEmployeeById(id2);
		employee.setSalary(salary2);
		dao.updateEmployee(id2,employee);
		
		
		
		
		
		
		
		
	}

	public void updateName(int id3, String name3)throws EmployeeNotFoundException{
			Employee e3=dao.fetchEmployeeById(id3);
			e3.setName(name3);
			dao.updateEmployee(id3,e3);
	}

}