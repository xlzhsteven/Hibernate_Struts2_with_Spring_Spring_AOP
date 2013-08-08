package com.xiaolong.svc;

import org.springframework.transaction.annotation.Transactional;

import com.xiaolong.model.Employee;
import com.xiaolong.dao.*;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		employeeDAO.getEmployeeById(id);
		return null;
	}

	@Override
	@Transactional
	public void addEmployee(Employee emp) {
		employeeDAO.addEmployee(emp);
	}

	@Override
	@Transactional
	public void fireEmployeeById(int id) {
		employeeDAO.fireEmployeeById(id);
	}

}
