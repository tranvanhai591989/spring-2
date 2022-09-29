package com.example.baithi.service.impl;

import com.example.baithi.model.AbcFitness;
import com.example.baithi.repository.IAbcFitnessRepository;
import com.example.baithi.service.IAbcFitnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AbcFitnessService implements IAbcFitnessService {
    @Autowired
    private IAbcFitnessRepository iAbcFitnessRepository;


    @Override
    public Boolean existsCode(String establishmentName) {
        return establishmentName.equals(iAbcFitnessRepository.exitCode(establishmentName));
    }

    @Override
    public AbcFitness save(AbcFitness abcFitness) {
        return iAbcFitnessRepository.save(abcFitness);
    }

    @Override
    public Optional<AbcFitness> findAbcFitnessById(int id) {
        return iAbcFitnessRepository.findById(id);
    }

    @Override
    public void deleteAbcFitnessById(int id) {
    iAbcFitnessRepository.deleteById(id);
    }

    @Override
    public Page<AbcFitness> findAllAbcFitnessByKeyword(Pageable pageable, String name) {
        return iAbcFitnessRepository.findAll(pageable, "%" + name + "%");
    }
}
