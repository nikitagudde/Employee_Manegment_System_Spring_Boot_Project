package com.Employee_Manegment_System.service;
import java.util.List;
import com.Employee_Manegment_System.entity.Employee;
public interface EmployeeService {
List<Employee> getAllemployees();
Employee saveEmployee(Employee employee);
Employee getEmployeeById(Long id);
Employee updateEmployee(Employee employee);
void deleteEmployeeById(Long id);
}
