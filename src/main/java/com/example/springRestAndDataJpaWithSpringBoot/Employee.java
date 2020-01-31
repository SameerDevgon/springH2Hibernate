package com.example.springRestAndDataJpaWithSpringBoot;
 
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
 
/**
 * @author JavaSolutionsGuide
 *
 */
@Entity
@Table(name="EMPLOYEE")
@NamedQuery(name = "Employee.findAllOrderedByNameDescending",
query = "SELECT new com.example.springRestAndDataJpaWithSpringBoot.EpDto (c.name, p.project) FROM Employee c INNER JOIN c.projects p where c.id= :myid")
public class Employee {
	
  
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
  
 @Column(name="EMPLOYEE_NAME")
 private String name;
  
 @Column(name="EMPLOYEE_SALARY")
 private Integer salary;
  
 @Column(name="DEPARTMENT")
 private String department;
 
 @ManyToMany(
	        cascade = CascadeType.ALL,
	        
	        fetch=FetchType.LAZY
	    )
 @JoinColumn(name = "post_id")
 private Set<Project> projects ;
 
 public Set<Project> getProjects() {
	return  projects;
}

public void setProjects(HashSet<Project> projects) {
	this.projects = projects;
}

public Long getId() {
  return id;
 }
 
 public void setId(Long id) {
  this.id = id;
 }
 
 public String getName() {
  return name;
 }
 
 public void setName(String name) {
  this.name = name;
 }
 
 public Integer getSalary() {
  return salary;
 }
 
 public void setSalary(Integer salary) {
  this.salary = salary;
 }
 
 public String getDepartment() {
  return department;
 }
 
 public void setDepartment(String department) {
  this.department = department;
 }
}