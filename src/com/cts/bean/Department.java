package com.cts.bean;

import java.util.List;

public class Department {
public int id;
public String name;
public List<EmployeeDetails> employee;

public Department(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}
public int getId() {
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

public List<EmployeeDetails> getEmployee() {
	return employee;
}
public void setEmployee(List<EmployeeDetails> employee) {
	this.employee = employee;
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", employee=" + employee + "]";
}


}
