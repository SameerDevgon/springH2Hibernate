package com.example.springRestAndDataJpaWithSpringBoot;
 
import java.util.List;
 
/**
 * @author JavaSolutionsGuide
 *
 */
public interface EmployeeService {
 public List<Employee> retrieveEmployees();
 public List<EpDto> listallEmployees();
  
 public Employee getEmployee(Long employeeId);
  
 public void saveEmployee(Employee employee);
  
 public void deleteEmployee(Long employeeId);
  
 public void updateEmployee(Employee employee);
}