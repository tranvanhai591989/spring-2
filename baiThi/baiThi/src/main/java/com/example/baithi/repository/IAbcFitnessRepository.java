package com.example.baithi.repository;

import com.example.baithi.model.AbcFitness;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAbcFitnessRepository extends JpaRepository<AbcFitness, Integer> {

    @Query(value="SELECT establishment_name FROM abc_fitness where establishment_name=:establishment_name",nativeQuery=true)
    String exitCode(@Param("establishment_name") String establishmentName);


    @Query(value = "select * from abc_fitness where establishment_name like :nameSearch", nativeQuery = true,
            countQuery = "select * from abc_fitness where establishment_name like :nameSearch")
    Page<AbcFitness> findAll(Pageable pageable, @Param("nameSearch") String nameSearch);

}


