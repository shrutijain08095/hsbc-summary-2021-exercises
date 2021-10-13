package com.demo.test;


import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.FactoryPattern;
import com.demo.exception.EmployeeAlreadyExistsException;
import com.demo.exception.EmployeeNotFoundException;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;


public class ViewController {

	public static void main(String[] args) throws EmployeeNotFoundException {
		System.out.println("Enter the factory choice");
		Scanner scan = new Scanner(System.in);
		System.out.println("1: array \n2: TreeSet");
		int factorychoice=scan.nextInt();
		EmployeeDao dao = FactoryPattern.getDaoInstance(factorychoice);
		EmployeeService service = FactoryPattern.getServiceInstance(dao);
		
		int controllerOption = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Store employee 2: Find employee by id 3: Find All employees 4: Update Salary 5: Update Nmae 0: Exit");
			controllerOption = scan.nextInt();
			switch(controllerOption) {
			case 1: 
				System.out.println("--- Enter employee details ------");
				Employee emp = new Employee();
				System.out.println("Enter id");
				emp.setId(scan.nextInt()); // instead of int id = scan.nextInt(); emp.setId(id);
				System.out.println("Enter name");
				emp.setName(scan.next());
				System.out.println("Enter salary");
				emp.setSalary(scan.nextDouble());
				try {
					service.store(emp);
				} catch (EmployeeAlreadyExistsException e2) {
					// TODO Auto-generated catch block
					System.out.println(e2.getMessage());
					break;
				}
				System.out.println("Successfully stored.....");
				System.out.println("---------------------------------");
				break;
			case 2: 
				System.out.println("enter details of the employee to be updated");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter id");
				int id1=sc.nextInt();
				try {
					Employee e1=service.findEmployee(id1);
					System.out.println("Employee is found.....");
					System.out.println("Hello "+e1.getName()+", your salary is : "+e1.getSalary());
					
					
				}
				catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
					
				}
				
				
				break;
				
				
				
			case 3: 
				Employee[] employees = service.findAllEmployees();
				for(Employee e : employees) {
					System.out.println("Hello "+e.getName()+", Your salary is: "+e.getSalary()+" and id is : "+e.getId());
				}
				break;
			case 4: 
				Scanner sc2=new Scanner(System.in);
				
				System.out.println("for salary to be updated ");
				System.out.println("enter id");
				
				int id2=sc2.nextInt();
				System.out.println("enter salary");
				double salary2=sc2.nextDouble();
				try {
					service.updateSalary(id2,salary2);
					
				}catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
					
				}
				
				
				
				
				
				break;
			case 5: 
				try {
					Scanner sc3=new Scanner(System.in);
					
					System.out.println("for name to be updated ");
					System.out.println("enter id");
					
					int id3=sc3.nextInt();
					System.out.println("enter name");
					String name3=sc3.next();
					service.updateName( id3,name3 );
				}catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
					
				}
				
				break;
			}
		} while(controllerOption != 0);
		scan.close();
	}
	
}