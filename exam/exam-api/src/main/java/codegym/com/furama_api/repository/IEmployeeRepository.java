package codegym.com.furama_api.repository;

import codegym.com.furama_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
