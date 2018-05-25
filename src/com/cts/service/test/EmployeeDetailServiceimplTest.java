package com.cts.service.test;

import com.cts.bean.EmployeeDetails;
import com.cts.service.EmployeeDetailService;
import com.cts.serviceimpl.EmployeeDetailsServiceimpl;

public class EmployeeDetailServiceimplTest {
	public static void main(String[] args) {
		EmployeeDetailService employeedetailservice = new EmployeeDetailsServiceimpl();
		
		EmployeeDetails employee1;
		employee1 = new EmployeeDetails(1, "saro", 40000);
		employeedetailservice.add(employee1);
		employee1 = new EmployeeDetails(2, "saravanan", 10000);
		employeedetailservice.add(employee1);
		
		employee1 = new EmployeeDetails(3, "vicky", 20000);
		employeedetailservice.add(employee1);
		employeedetailservice.display();
		employeedetailservice.get();
		System.out.println(employeedetailservice.getAllEmployees(15000));
		System.out.println(employeedetailservice.get(8000,260000));
		
		
		
		//test.display();
		
		//EmployeeDetails employee3=new EmployeeDetails(1,"dinu",2000);
		//test.update(employee3);
		//test.display();
		
		
		/*test.delete(1);
		test.display();
*/

	}
}
