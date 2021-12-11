package hu.webuni.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
		// TODO Auto-generated method stub
		
	}

}
