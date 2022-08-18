package com.emp.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	
	//Dummy Emp List
	List<Employee> list = List.of(
			new Employee(1011L, "Tony", "9098123450"),
			new Employee(1012L, "Hulk", "9098123451"),
			new Employee(1013L, "Captain", "9098123452"),
			new Employee(1014L, "Peter", "9098123453"),
			new Employee(1015L, "Natasha", "9098123454"));
	
	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
