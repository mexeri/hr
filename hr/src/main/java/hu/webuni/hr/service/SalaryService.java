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
	public void SetNewSalary(Employee employee)
	{
		int iMonthlySalary = (int)(employee.getiMonthlySalary()*(1+employeeservice.getRaisePercent(employee)/100.0));
		employee.setiMonthlySalary(iMonthlySalary);
	}
}
