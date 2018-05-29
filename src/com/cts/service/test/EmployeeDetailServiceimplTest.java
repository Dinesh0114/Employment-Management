package com.cts.service.test;

import com.cts.bean.EmployeeDetails;
//import com.cts.hashmap.EmployeeDetailServiceImplHash;
import com.cts.service.EmployeeDetailService;
import com.cts.serviceimpl.EmployeeDetailsServiceimpl;

public class EmployeeDetailServiceimplTest {
	public static void main(String[] args) {
		//EmployeeDetailService employeedetailservice = new EmployeeDetailServiceImplHash();
		EmployeeDetailService employeedetailservice = new EmployeeDetailsServiceimpl();
		EmployeeDetails employee1;
		employee1 = new EmployeeDetails(105, "saro", 40000,10);
		employeedetailservice.add(employee1);
		employee1 = new EmployeeDetails(107, "sara", 400000,10);
		employeedetailservice.add(employee1);
		employeedetailservice.display();
		
		employeedetailservice.delete(101);
		employeedetailservice.display();
		
		/*employee1 = new EmployeeDetails(2, "saravanan", 10000,102);
		employeedetailservice.add(employee1);
		
		employee1 = new EmployeeDetails(3, "vicky", 20000,106);
		employeedetailservice.add(employee1);
		employee1 = new EmployeeDetails(4, "vignesh", 20000,108);
		employeedetailservice.add(employee1);
		employeedetailservice.display();*/
		//employeedetailservice.get();//dont need display method.it can be called directly
		/*employeedetailservice.delete(1);
		employeedetailservice.display();
		employee1=new EmployeeDetails(1,"dinu",2000);
		employeedetailservice.update(employee1);
		employeedetailservice.display();
		//test.update(employee3);
		employeedetailservice.display(employeedetailservice.getEmployee(1));
		
		
		System.out.println(employeedetailservice.getAllEmployees(15000));
		System.out.println(employeedetailservice.get(8000,260000));
		*/
		/*employeedetailservice.display();*/
		
		//test.display();
		
		//EmployeeDetails employee3=new EmployeeDetails(1,"dinu",2000);
		//test.update(employee3);
		//test.display();
		
		
	/*	test.delete(1);
		test.display();
*/

	}
}
