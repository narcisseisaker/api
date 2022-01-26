package com.hr.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.hr.api.model.Employee;
import com.hr.api.repository.EmployeeRepository;


@Component
public class DataLoaderEmployee implements ApplicationRunner{
	/*
	 * private EmployeeRepository employeeRepository;
	 * 
	 * 
	 * @Autowired public DataLoaderEmployee( EmployeeRepository employeeRepository)
	 * {
	 * 
	 * this.employeeRepository=employeeRepository; }
	 * 
	 * @Override public void run(ApplicationArguments args) {
	 * employeeRepository.save(new Employee()); }
	 */
	 @Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public void run(ApplicationArguments args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		Employee employee4=new Employee();

		
		employee1.setFirstName("Laurentine");
		employee1.setLastName("GINA");
		employee1.setMail("laurentgina@mail.com");
		employee1.setPassword("laurent");
		
		employee2.setFirstName("Laurent1");
		employee2.setLastName("GINA1");
		employee2.setMail("laurentgina1@mail.com");
		employee2.setPassword("laurent1");
			
		employee3.setFirstName("Laurent2");
		employee3.setLastName("GINA2");
		employee3.setMail("laurentgina2@mail.com");
		employee3.setPassword("laurent2");
		
		employee4.setFirstName("Laurent3");
		employee4.setLastName("GINA3");
		employee4.setMail("laurentgina3@mail.com");
		employee4.setPassword("laurent3");
		
		
		
	  employeeRepository.save(employee1);
	  employeeRepository.save(employee2);
	  employeeRepository.save(employee3);
	  employeeRepository.save(employee4);
	
	  }


}
