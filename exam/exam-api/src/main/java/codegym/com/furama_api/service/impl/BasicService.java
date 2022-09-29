package codegym.com.furama_api.service.impl;

import codegym.com.furama_api.model.Basic;
import codegym.com.furama_api.repository.IBasicRepository;
import codegym.com.furama_api.service.IBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasicService implements IBasicService {
    @Autowired
    IBasicRepository basicRepository;

    @Override
    public List<Basic> findAll() {
        return basicRepository.findAll();
    }

    @Override
    public void save(Basic basic) {
        basicRepository.save(basic);
    }

    @Override
    public Optional<Basic> findById(int id) {
        return basicRepository.findById(id);
    }

    @Override
    public void update(Basic basic) {

    }

    @Override
    public void delete(int id) {
        basicRepository.deleteById(id);
    }
}
