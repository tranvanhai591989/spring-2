package codegym.com.furama_api.service.impl;

import codegym.com.furama_api.model.Position;
import codegym.com.furama_api.repository.IPositionRepository;
import codegym.com.furama_api.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
