package com.Employee_Manegment_System.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Employee_Manegment_System.entity.Employee;
import com.Employee_Manegment_System.repo.EmployeeRepository;
import com.Employee_Manegment_System.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;
public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
super();
this.employeeRepository = employeeRepository;
}
@Override
public List<Employee> getAllemployees() {
return employeeRepository.findAll();
}
@Override
public Employee saveEmployee(Employee employee) {
return employeeRepository.save(employee);
}
@Override
public Employee getEmployeeById(Long id) {
return employeeRepository.findById(id).get();
}
@Override
public Employee updateEmployee(Employee employee) {
return employeeRepository.save(employee);
}
@Override
public void deleteEmployeeById(Long id) {
employeeRepository.deleteById(id);
}
}