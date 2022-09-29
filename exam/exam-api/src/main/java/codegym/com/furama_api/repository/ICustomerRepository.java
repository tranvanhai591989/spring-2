package codegym.com.furama_api.repository;

import codegym.com.furama_api.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = " select customer.id, customer.name, customer.address, customer.day_of_birth, customer.email, " +
            "customer.id_card, customer.phone, customer.gender, customer.id_c from customer where name like :name ", nativeQuery = true,
            countQuery = " select count(*) from (select customer.id, customer.name, customer.address, customer.day_of_birth, " +
                    "customer.email, customer.id_card, customer.phone, customer.gender, customer.id_c from customer where name like :name) temp_table ")
    Page<Customer> findAll(Pageable pageable, @Param("name") String name);
}
