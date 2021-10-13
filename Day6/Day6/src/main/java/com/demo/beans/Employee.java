package com.demo.beans;

public class Employee implements Comparable<Employee> {
	public Employee(int id) {
		
		this.id = id;
	}
	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	
	private int id;
	private String name;
	private double salary;
	
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public int compareTo(Employee o) {
		return Integer.compare(this.id , id);
		
	}
}