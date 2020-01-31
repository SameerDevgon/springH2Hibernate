package com.example.springRestAndDataJpaWithSpringBoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id ;
	
	private String project;
	
	private String dep;
	
	
	
	public String getProject() {
		return project;
	}



	public void setProject(String project) {
		this.project = project;
	}



	public String getDep() {
		return dep;
	}



	public void setDep(String dep) {
		this.dep = dep;
	}



	
	
	
}
