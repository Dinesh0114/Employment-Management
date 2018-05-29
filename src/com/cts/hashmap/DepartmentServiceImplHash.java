/*package com.cts.hashmap;

import java.util.HashMap;
import java.util.List;

import com.cts.bean.Department;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentService;

public class DepartmentServiceImplHash implements DepartmentService{
private HashMap<Integer,Department> departmentMap;

	public DepartmentServiceImplHash() {
	super();
	departmentMap = new HashMap<Integer, Department>();
}

	public DepartmentServiceImplHash(HashMap<Integer, Department> departmentList) {
	super();
	departmentList = new HashMap<Integer, Department>();
	this.departmentMap = departmentList;
}

	@Override
	public boolean add(Department dept) {
		if (departmentMap.containsKey(dept)) {
			return false;
		}
		departmentMap.put(dept.getId(), dept);

		return true;																																																																																																																																																																																																																									
	}
	

	@Override
	public List<Department> getAlldepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		if (departmentMap.containsKey(id)) {
			departmentMap.remove(id);

			return true;
		}

		return false;
	}

	@Override
	public boolean update(Department dept) {
		if (departmentMap.containsKey(dept.getId())) {
			departmentMap.remove(dept);
			departmentMap.put(dept.getId(), dept);
			return true;
		}
		
		return false;
	}

	@Override
	public Department getdepartment(int deptid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExist(int empId, int DeptId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEmployeeDetailsToDepartment(int empid, int deptid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeDetailsToDepartment(int empid, int deptid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeeDetails> getallEmployees(int deptid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(Department dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/