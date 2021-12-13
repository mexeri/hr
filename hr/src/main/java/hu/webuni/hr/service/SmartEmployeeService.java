package hu.webuni.hr.service;

import hu.webuni.hr.config.HrConfigProperties;
import hu.webuni.hr.config.HrConfigProperties.Smart;
import hu.webuni.hr.model.Employee;
import java.time.*;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartEmployeeService implements EmployeeService 
{
	@Autowired
	HrConfigProperties config;
	
	
	@Override
	public int getRaisePercent(Employee employee) 
	{
		double dYearsBetween = ChronoUnit.DAYS.between(employee.getDtStartTime(),LocalDateTime.now())/365.0;
		
		Smart smartConfig = config.getSalary().getSmart();
		
		if(dYearsBetween>=config.getSalary().getSmart().getLimit3()) return config.getSalary().getSmart().getPercent3();
		if(dYearsBetween>=config.getSalary().getSmart().getLimit2()) return config.getSalary().getSmart().getPercent2();
		if(dYearsBetween>=config.getSalary().getSmart().getLimit1()) return config.getSalary().getSmart().getPercent1();
		return 0;

	}


}
