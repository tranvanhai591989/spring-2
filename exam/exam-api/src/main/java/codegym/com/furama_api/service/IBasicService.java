package codegym.com.furama_api.service;

import codegym.com.furama_api.model.Basic;

import java.util.List;
import java.util.Optional;

public interface IBasicService {
    List<Basic> findAll();

    void save(Basic basic);

    Optional<Basic> findById(int id);

    void update(Basic basic);

    void delete(int id);

}
