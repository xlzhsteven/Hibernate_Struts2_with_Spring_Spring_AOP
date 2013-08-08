package com.xiaolong.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.xiaolong.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Employee getEmployeeById(int id) {
		//Transaction tx = sessionFactory.getCurrentSession().beginTransaction();
		//Employee emp = (Employee) sessionFactory.getCurrentSession().get(com.xiaolong.model.Employee.class, id);
		// System.out.println(emp.getName());
		//tx.commit();
		//sessionFactory.getCurrentSession().close();
		Employee emp = (Employee)sessionFactory.getCurrentSession().get(com.xiaolong.model.Employee.class, id);
		
		//Quary API
		/*String hql = "from com.xiaolong.model.Employee as e where e.id>:id";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setInteger("id", 1);
		List<Employee> list = (List<Employee>)q.list();*/
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(Employee.class);
		cr.add(Restrictions.gt("id", 1));
		List<Employee> empList = (List<Employee>)cr.list();
		return emp;
	}

	@Override
	public void addEmployee(Employee emp) {
		//Transaction tx = sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().save(emp);
		System.out.println(emp);
		// System.out.println(emp.getName());
		//tx.commit();
		//sessionFactory.getCurrentSession().close();
	}

	@Override
	public void fireEmployeeById(int id) {
		//Transaction tx = sessionFactory.getCurrentSession().beginTransaction();
		Employee emp = (Employee) sessionFactory.getCurrentSession().get(
				com.xiaolong.model.Employee.class, id);
		//System.out.println(emp);
		sessionFactory.getCurrentSession().delete(emp);
		//tx.commit();
		//sessionFactory.getCurrentSession().close();
	}
}
