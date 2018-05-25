package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.EmployeeDetails;
import com.cts.service.EmployeeDetailService;

public class EmployeeDetailsServiceimpl implements EmployeeDetailService {

	private ArrayList<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();

	@Override
	public boolean add(EmployeeDetails emp) {
		if (get(emp.getId()) != null) {
			return false;
		}
		empList.add(emp);
		return true;
	}

	@Override
	public boolean update(EmployeeDetails emp) {
		if (get(emp.getId()) == null) {
			return false;
		}

		empList.remove(emp.getId());
		empList.add(emp);

		return true;
	}

	@Override
	public boolean delete(int id) {
		EmployeeDetails emp2 = get(id);
		if (emp2 != null) {
			empList.remove(emp2);
		}
		

		return true;
	}

	@Override
	public EmployeeDetails get(int id) {
		for (EmployeeDetails emp : empList) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public List<EmployeeDetails> get() {
		return empList;
		// TODO Auto-generated method stub

	}

	@Override
	public void display(EmployeeDetails emp) {

		{

			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());

		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (EmployeeDetails emp : empList) {
			display(emp);
		}

	}

	@Override
	public List<EmployeeDetails> getAllEmployees(int salary) {
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		for(EmployeeDetails emp:empList){
			if(emp.getSalary()>salary){
				salaryList.add(emp);
			}
			}	
	return empList;
		
	}

	@Override
	public List<EmployeeDetails> get(int min, int max) {
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		for(EmployeeDetails emp:empList){
			if(emp.getSalary()>min && emp.getSalary()<max){
				salaryList.add(emp);
			}
			}
		return empList;
		
		
	}

}
