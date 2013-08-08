package com.xiaolong.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaolong.model.Employee;
import com.xiaolong.svc.EmployeeService;

public class CreateEmployeeAction extends ActionSupport{
	Employee emp = new Employee();

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	private EmployeeService employeeService;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public String execute(){
		employeeService.addEmployee(emp);
		return "success";
	}
}
