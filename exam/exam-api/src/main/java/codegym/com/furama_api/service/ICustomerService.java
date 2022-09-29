package codegym.com.furama_api.service;

import codegym.com.furama_api.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    Page<Customer> findAll(Pageable pageable, String keyWord);

    List<Customer> findAllC();

    void save(Customer customer);

    Optional<Customer> findById(int id);

    void update(Customer customer);

    void delete(int id);

}
