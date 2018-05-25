package com.cts.service;

import java.util.List;

import com.cts.bean.Department;
import com.cts.bean.EmployeeDetails;

public interface DepartmentService {
	public boolean  add(Department dept);
	//public Department department(int id);
	public List< Department > getAlldepartments();
	public boolean delete(int id);   
	public boolean update(Department dept);
	public Department getdepartment(int deptid);
	public boolean isExist(int empId,int DeptId);
	public boolean addEmployeeDetailsToDepartment(int empid, int deptid);
	public boolean deleteEmployeeDetailsToDepartment(int empid, int deptid);
	public List<EmployeeDetails>  getallEmployees(int deptid);
	public void display(Department dept);
	public void display();
	public List<EmployeeDetails> getEmployees(int deptId,int amount);
	public List<EmployeeDetails> getEmployees(int deptId,int min,int max);
	

}
