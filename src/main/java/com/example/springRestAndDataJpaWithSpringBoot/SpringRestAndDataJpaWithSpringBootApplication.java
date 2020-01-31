package com.example.springRestAndDataJpaWithSpringBoot;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2 
@SpringBootApplication
public class SpringRestAndDataJpaWithSpringBootApplication {
	
	@Autowired
	static
	EmployeeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAndDataJpaWithSpringBootApplication.class, args);
		
		Employee e = new Employee();
		
		Project p1 = new Project();
		p1.setProject("p1");
		
		Project p2 = new Project();
		p2.setProject("p2");
		
		e.setId(100L);
		e.setProjects(new HashSet<Project>() {{add(p1);add(p2) ;}});
		
		Long l= new Long(1L);
		//repo.saveAndFlush(e);
		
	}

}
