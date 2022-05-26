package com.chandra.springstart.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandra.springstart.springjdbc.employee.dao.EmployeeDao;
import com.chandra.springstart.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chandra/springstart/springjdbc/employee/test/config.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		//Employee employee = new Employee();

		//employee.setId(2);
		//employee.setFirstName("Raj");
		//employee.setLastName("Sen");
		//int result = dao.create(employee);
		//int result=dao.update(employee);
		//int result=dao.delete(1);
		//Employee result = dao.read(2);
		List<Employee> result = dao.read();
		System.out.println("Employee Record: " + result);

	}

}
