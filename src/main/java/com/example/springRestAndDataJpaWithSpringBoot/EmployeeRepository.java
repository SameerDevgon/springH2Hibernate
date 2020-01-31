package com.example.springRestAndDataJpaWithSpringBoot;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
 
	
	
	List<EpDto> findAllOrderedByNameDescending(@Param("myid") long myid);
}
