package com.cts.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.bean.EmployeeDetails;
import com.cts.dbconnection.DBConnection;
import com.cts.service.EmployeeDetailService;

public class EmployeeDetailsServiceimpl implements EmployeeDetailService {

	private ArrayList<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();
private Connection con;
private PreparedStatement preparestatement;
	@Override
	public boolean add(EmployeeDetails emp) {
		con=DBConnection.getConnection();
		try {
			preparestatement=con.prepareStatement("insert into employees values(?,?,?,?);");
			preparestatement.setInt(1, emp.getId());
			preparestatement.setString(2,emp.getName());
			preparestatement.setInt(3, emp.getSalary());
			preparestatement.setInt(4, emp.getDeptId());
			preparestatement.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}
		/*if (getEmployee(emp.getId()) != null) {
			return false;
		}
		empList.add(emp);
		return true;
		
	}
*/
	@Override
	public boolean update(EmployeeDetails emp) {
		
	
			
		if (getEmployee(emp.getId()) == null) {
			return false;
		}

		empList.remove(emp.getId());
		empList.add(emp);

		return true;
	}

	@Override
	public boolean delete(int id) {
		con=DBConnection.getConnection();
		try {
			preparestatement=con.prepareStatement("DELETE FROM employees where ID = ?");
			 preparestatement.setInt(1, id);
			 preparestatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}
		/*EmployeeDetails emp2 = getEmployee(id);
		if (emp2 != null) {
			empList.remove(emp2);
		}
		

		return true;
	}
*/
	@Override
	public EmployeeDetails getEmployee(int id) {
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
	return salaryList;
		
	}

	@Override
	public List<EmployeeDetails> get(int min, int max) {
		List<EmployeeDetails> salaryList=new ArrayList<EmployeeDetails>();
		for(EmployeeDetails emp:empList){
			if(emp.getSalary()>min && emp.getSalary()<max){
				salaryList.add(emp);
			}
			}
		return salaryList;
		
		
	}

}
