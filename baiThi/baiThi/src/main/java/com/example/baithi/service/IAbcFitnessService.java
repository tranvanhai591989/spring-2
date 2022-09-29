package com.example.baithi.service;

import com.example.baithi.model.AbcFitness;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IAbcFitnessService {
    Boolean existsCode(String establishmentName);

    AbcFitness save(AbcFitness abcFitness);

    Optional<AbcFitness> findAbcFitnessById(int id);

    void deleteAbcFitnessById(int id);

    Page<AbcFitness> findAllAbcFitnessByKeyword(Pageable pageable, String name);
}
