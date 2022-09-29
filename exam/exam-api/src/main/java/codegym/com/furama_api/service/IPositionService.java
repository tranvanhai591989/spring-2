package codegym.com.furama_api.service;

import codegym.com.furama_api.model.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
}
