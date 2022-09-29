package codegym.com.furama_api.service.impl;

import codegym.com.furama_api.model.Employee;
import codegym.com.furama_api.repository.IEmployeeRepository;
import codegym.com.furama_api.repository.IPositionRepository;
import codegym.com.furama_api.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
