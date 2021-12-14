package hu.webuni.hr;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import hu.webuni.hr.model.Employee;
import hu.webuni.hr.service.SalaryService;

//@ComponentScan("hu.webuni.hr")
@SpringBootApplication()
public class HrApplication implements CommandLineRunner {

	@Autowired
	SalaryService salaryservice;
	
	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e = new Employee(1L,"Nagy Levente","jegykotegelo", 100,LocalDateTime.parse("2002-12-02T11:25:25"));
		
		salaryservice.SetNewSalary(e);
		System.out.print(e.getiMonthlySalary());
		
	}

}
