 package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.Department;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeDetailService;

public class DepartmentServiceimpl implements DepartmentService {
	private ArrayList<Department> departmentList;
	private EmployeeDetailService employeeDetailService;
	
	public DepartmentServiceimpl() {
		departmentList = new ArrayList<Department>();
		employeeDetailService=new EmployeeDetailsServiceimpl();
		
	}
	public DepartmentServiceimpl(EmployeeDetailService employeeDetailService) {
		departmentList = new ArrayList<Department>();
		this.employeeDetailService = employeeDetailService;
	}

	@Override
	public boolean add(Department dept) {
		if(getdepartment(dept.getId())!=null)
		{
			return false;
		}
			
		// TODO Auto-generated method stub
	   departmentList.add(dept);
	   return true;
	}

	

	@Override
	public List<Department> getAlldepartments() {
		// TODO Auto-generated method stub
		return departmentList;
	}

	@Override
	public boolean delete(int id) {
		if(getdepartment(id)!=null)
		{
			return false;
		}
		// TODO Auto-generated method stub
		departmentList.remove(getdepartment(id));
		return false;
	}

	@Override
	public boolean update(Department dept) {
		if(getdepartment(dept.getId())==null) {
			return false;
		}
		departmentList.remove(dept.getId());
		departmentList.add(dept);
		return true;
		

	}

	

	@Override
	public List<EmployeeDetails> getallEmployees(int deptid) 
	{
		List<Department> department=getAlldepartments();
		for(Department list:department)
			if(deptid==list.getId())
			{
				return list.getEmployee();
			}
		
		return null;
	}

	@Override
	public Department getdepartment(int deptid) {
		for(Department dept:departmentList)
		{
			if(dept.getId()==deptid)
		{
			return dept;
		}
		
			}
		return null;
}
	
	

	@Override
	public void display() {
		for(Department dept:departmentList)
		{
			display(dept);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(Department dept) {
		System.out.println(dept.getId());
		System.out.println(dept.getName());
/*	System.out.println(dept.getEmployee().getId());
	System.out.println(dept.getEmployee().getName());
	System.out.println(dept.getEmployee().getSalary());
		*/
		
	}

	@Override
	public boolean addEmployeeDetailsToDepartment(int empid, int deptid) {
		
		EmployeeDetails emp=employeeDetailService.get(empid);
		Department dept=getdepartment(deptid);
		
		List<EmployeeDetails> empList=getallEmployees(deptid);
		departmentList.remove(dept);
		
		if(emp == null  || dept ==null)
		{
			return false;
		}
	
		if(empList==null)
		{
			empList=new ArrayList<EmployeeDetails>();

		}
		isExist(empid,deptid);
		empList.add(emp);
		dept.setEmployee(empList);
		departmentList.add(dept);

		return true;
	}
	@Override
	public boolean deleteEmployeeDetailsToDepartment(int empid, int deptid) {
		EmployeeDetails emp=employeeDetailService.get(empid);
		Department dept=getdepartment(deptid);
		if(emp == null  || dept ==null)
		{
			return false;
		}
		List<EmployeeDetails> empList=getallEmployees(deptid);
		if(empList==null)
		{
			empList=new ArrayList<EmployeeDetails>();

		}
		isExist(empid,deptid);
		departmentList.remove(dept);
		
		return false;
	}

	@Override
	public boolean isExist(int empId, int DeptId) {
		List<EmployeeDetails> EmpList=getallEmployees(DeptId);
		if(EmpList == null) {
			return false;
		}
		for(EmployeeDetails emp:EmpList)
		{
			if(emp.getId() ==empId)
			{
				return false;
			}
		}
		
		return true;
	}
	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int amount) {
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		Department department=getdepartment(deptId);
		
		List<EmployeeDetails> EmpList=department.getEmployee();
		for(EmployeeDetails emp:EmpList){
			if(emp.getSalary()>=amount){
				salaryList.add(emp);
			}
		}
		
		return salaryList;
		
	}
	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int min, int max) {
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		Department department=getdepartment(deptId);
		
		List<EmployeeDetails> EmpList=department.getEmployee();
		for(EmployeeDetails emp:EmpList){
			if(emp.getSalary()>min && emp.getSalary()<max){
				salaryList.add(emp);
			}
		}
		
		return salaryList;
		
	}

	
	}

	
