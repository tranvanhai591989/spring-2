package com.example.baithi.service.impl;

import com.example.baithi.model.FitnessCard;
import com.example.baithi.repository.IFitnessCardRepository;
import com.example.baithi.service.IFitnessCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FitnessCardService implements IFitnessCardService {
    @Autowired
    private IFitnessCardRepository iFitnessCardRepository;

    @Override
    public FitnessCard save(FitnessCard fitnessCard) {
        return iFitnessCardRepository.save(fitnessCard);
    }

    @Override
    public Optional<FitnessCard> findFitnessCardById(int id) {
        return iFitnessCardRepository.findById(id);
    }

    @Override
    public void deleteFitnessCardById(int id) {
        iFitnessCardRepository.deleteById(id);
    }

    @Override
    public Page<FitnessCard> findAllFitnessCard(Pageable pageable) {
        return iFitnessCardRepository.findAll(pageable);
    }

    @Override
    public Page<FitnessCard> findAllFitnessCardByKeyword(String keyword, Pageable pageable) {
        return null;
    }
}
