package com.xiaolong.dao;

import com.xiaolong.model.Employee;

public interface EmployeeDAO {
	public Employee getEmployeeById(int id);
	public void addEmployee(Employee emp);
	public void fireEmployeeById(int id);
}
