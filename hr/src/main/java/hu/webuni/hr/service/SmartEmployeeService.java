package hu.webuni.hr.service;

import hu.webuni.hr.model.Employee;
import java.time.*;

import org.springframework.stereotype.Service;

@Service
public class SmartEmployeeService implements EmployeeService 
{
	@Override
	public int getRaisePercent(Employee employee) 
	{
		long lYearsBetween = Duration.between(LocalDateTime.now(), employee.getDtStartTime()).toDays()/365;
		if(lYearsBetween>=10) return 10;
		if(lYearsBetween>=5) return 5;
		if(lYearsBetween>=2.5) return 2;
		return 0;

	}


}
