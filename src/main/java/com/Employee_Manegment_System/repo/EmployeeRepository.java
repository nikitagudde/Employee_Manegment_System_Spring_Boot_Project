package com.Employee_Manegment_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Employee_Manegment_System.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
