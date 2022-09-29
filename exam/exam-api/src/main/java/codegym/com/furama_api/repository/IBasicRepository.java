package codegym.com.furama_api.repository;

import codegym.com.furama_api.model.Basic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBasicRepository extends JpaRepository<Basic, Integer> {
}
