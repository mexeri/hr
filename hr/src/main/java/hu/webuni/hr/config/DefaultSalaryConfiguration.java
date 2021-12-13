package hu.webuni.hr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.service.DefaultEmployeeService;
import hu.webuni.hr.service.EmployeeService;


@Configuration
@Profile("!smart")
public class DefaultSalaryConfiguration 
{
		
		@Bean
		public EmployeeService employeeservice()
		{
			return new DefaultEmployeeService();
		}
		

}
