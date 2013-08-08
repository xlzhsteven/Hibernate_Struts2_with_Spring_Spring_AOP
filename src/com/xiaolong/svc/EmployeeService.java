package com.xiaolong.svc;

import com.xiaolong.model.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(int id);
	public void addEmployee(Employee emp);
	public void fireEmployeeById(int id);
}
