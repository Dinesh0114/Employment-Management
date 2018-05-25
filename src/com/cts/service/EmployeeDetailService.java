package com.cts.service;

import java.util.List;

import com.cts.bean.EmployeeDetails;

public interface EmployeeDetailService {
public boolean add(EmployeeDetails emp);
public boolean update(EmployeeDetails emp);
public boolean delete(int id);
public EmployeeDetails get(int id);

public List<EmployeeDetails> get();
public void display(EmployeeDetails emp);
public void display();
public List<EmployeeDetails> getAllEmployees(int salary);
public List<EmployeeDetails> get(int min,int max);




}
