package com.example.baithi.service;

import com.example.baithi.model.FitnessCard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IFitnessCardService {
    FitnessCard save(FitnessCard fitnessCard);

    Optional<FitnessCard> findFitnessCardById(int id);

    void deleteFitnessCardById(int id);

    Page<FitnessCard> findAllFitnessCard(Pageable pageable);

    Page<FitnessCard> findAllFitnessCardByKeyword(String keyword, Pageable pageable);
}
