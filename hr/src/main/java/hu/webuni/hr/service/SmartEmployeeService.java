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
		
		if(dYearsBetween>=smartConfig.getLimit3()) return smartConfig.getPercent3();
		if(dYearsBetween>=smartConfig.getLimit2()) return smartConfig.getPercent2();
		if(dYearsBetween>=smartConfig.getLimit1()) return smartConfig.getPercent1();
		return 0;

	}


}
