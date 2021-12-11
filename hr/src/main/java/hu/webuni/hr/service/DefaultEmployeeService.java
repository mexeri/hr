package hu.webuni.hr.service;

import org.springframework.stereotype.Service;

import hu.webuni.hr.model.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService {

	@Override
	public int getRaisePercent(Employee employee) 
	{
		return 5;
	}

}
