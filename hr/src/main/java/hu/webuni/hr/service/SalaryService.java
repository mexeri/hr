package hu.webuni.hr.service;

import org.springframework.stereotype.Service;

import hu.webuni.hr.model.Employee;

@Service
public class SalaryService 
{
	private EmployeeService employeeservice;
	public SalaryService(EmployeeService employeeservice)
	{
		this.employeeservice = employeeservice;
	}
	public void GetSalary(Employee employee)
	{
		employee.setiMonthlySalary(employee.getiMonthlySalary()*(1+employeeservice.getRaisePercent(employee)/100));
	}
}
