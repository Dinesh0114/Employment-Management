package com.cts.service.test;

import com.cts.bean.Department;
import com.cts.bean.EmployeeDetails;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeDetailService;
import com.cts.serviceimpl.DepartmentServiceimpl;
import com.cts.serviceimpl.EmployeeDetailsServiceimpl;

public class DepartmentServiceimplTest {
	private static DepartmentService departmentService;
	private static EmployeeDetailService employeeService;

	public static void init() {
		/*
		 * Department dept4=new Department(3,"balaji"); Department dept5=new
		 * Department(14,"vj");
		 * 
		 * department.add(dept2); department.add(dept3); department.display();
		 * 
		 * Department dept6=new Department(1,"vishnu"); department.update(dept6);
		 * 
		 * department.display();
		 */
		employeeService = new EmployeeDetailsServiceimpl();

		EmployeeDetails empDetails;
		empDetails = new EmployeeDetails(101, "saro", 10000);
		employeeService.add(empDetails);
		empDetails = new EmployeeDetails(102, "saravanan", 20000);
		employeeService.add(empDetails);
		empDetails = new EmployeeDetails(103, "vicky", 40000);
		employeeService.add(empDetails);

		// employeeService.display();

		departmentService = new DepartmentServiceimpl(employeeService);
		Department deptDetails;
		deptDetails = new Department(1, "IT");
		departmentService.add(deptDetails);
		deptDetails = new Department(2, "CSE");
		departmentService.add(deptDetails);
		deptDetails = new Department(3, "ECE");
		departmentService.add(deptDetails);

		// departmentService.display();

		/*
		 * department.delete(1); department.display();
		 */

	}

	public static void main(String[] args) {
		init();

		departmentService.addEmployeeDetailsToDepartment(101, 1);

		//System.out.println(departmentService.getAlldepartments());

		departmentService.addEmployeeDetailsToDepartment(102, 2);

		departmentService.addEmployeeDetailsToDepartment(103, 1);

		// System.out.println(departmentService.getAlldepartments());

		System.out.println(departmentService.getEmployees(1, 9000));
		System.out.println(departmentService.getAlldepartments());

		/*
		 * departmentService.deleteEmployeeDetailsToDepartment(101,1);
		 * System.out.println(departmentService.getAlldepartments());
		 */
	}
}
