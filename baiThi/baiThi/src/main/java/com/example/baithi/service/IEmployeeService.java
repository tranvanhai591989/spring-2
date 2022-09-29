package com.example.baithi.service;

import com.example.baithi.model.Employee;
import com.example.baithi.model.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Position> findAllPosition();

    Employee save(Employee employee);

    Optional<Employee> findEmployeeById(int id);

    void deleteEmployeeById(int id);

    Page<Employee> findAllEmployee(Pageable pageable);

    Page<Employee> findAllEmployeeByKeyword(String keyword, Pageable pageable);
}
