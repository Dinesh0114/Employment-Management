/*package com.cts.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.cts.bean.EmployeeDetails;
import com.cts.service.EmployeeDetailService;

public class EmployeeDetailServiceImplHash implements EmployeeDetailService {
	private HashMap<Integer, EmployeeDetails> employeesMap;

	public EmployeeDetailServiceImplHash() {
		super();
		employeesMap = new HashMap<Integer, EmployeeDetails>();
	}

	public EmployeeDetailServiceImplHash(HashMap<Integer, EmployeeDetails> employees) {
		super();
		this.employeesMap = employees;
		employees = new HashMap<Integer, EmployeeDetails>();
	}

	@Override
	public boolean add(EmployeeDetails emp) {
		if (employeesMap.containsKey(emp)) {
			return false;
		}
		employeesMap.put(emp.getId(), emp);

		return true;																																																																																																																																																																																																																									
	}

	@Override
	public boolean update(EmployeeDetails emp) {
		if (employeesMap.containsKey(emp.getId())) {
			employeesMap.remove(emp);
			employeesMap.put(emp.getId(), emp);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean delete(int id) {

		if (employeesMap.containsKey(id)) {
			employeesMap.remove(id);

			return true;
		}

		return false;
	}

	@Override
	public EmployeeDetails getEmployee(int id) {
      if(employeesMap.containsKey(id))
      {
    	   return employeesMap.get(id);
    	
      
    		  
    	  }
     
		return null;
	}

	@Override
	public List<EmployeeDetails> get() {

		Collection<EmployeeDetails> empDetails = employeesMap.values();
		ArrayList<EmployeeDetails> empList = new ArrayList<EmployeeDetails>(empDetails);
		return empList;
	}

	@Override
	public void display(EmployeeDetails emp) {
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

	@Override
	public void display() {
		System.out.println(get());

	}

	@Override
	public List<EmployeeDetails> getAllEmployees(int salary) {
		Collection<EmployeeDetails> empDetails=employeesMap.values();
		ArrayList<EmployeeDetails> employeesList=new ArrayList<EmployeeDetails>(empDetails);
		List<EmployeeDetails> salaryList = new ArrayList<EmployeeDetails>();
		for(EmployeeDetails emp:employeesList) 
		{
			if(emp.getSalary()>salary)
			{
				salaryList.add(emp);
			}
		}
			return salaryList;
		
	}

	@Override
	public List<EmployeeDetails> get(int min, int max) {
		Collection<EmployeeDetails> empDetails=employeesMap.values();

		ArrayList<EmployeeDetails> empList=new ArrayList<EmployeeDetails>(empDetails);
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		for(EmployeeDetails emp:empList)
		{
			if(emp.getSalary()>min && emp.getSalary()<max)
				
			{
				salaryList.add(emp);
			}
		}
		return salaryList;
	}

}

*/