package hu.webuni.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.hr.config.HrConfigProperties;
import hu.webuni.hr.config.HrConfigProperties.Default;
import hu.webuni.hr.model.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService {

	@Autowired
	HrConfigProperties config;
	
	
	
	@Override
	public int getRaisePercent(Employee employee) 
	{
		Default defaultConfig = config.getSalary().getDef();
		
		return defaultConfig.getPercent();
	}

}
