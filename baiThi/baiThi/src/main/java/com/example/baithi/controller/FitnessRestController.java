package com.example.baithi.controller;

import com.example.baithi.dto.AbcFitnessDto;
import com.example.baithi.model.AbcFitness;
import com.example.baithi.service.IAbcFitnessService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/abcFitness")
public class FitnessRestController {
    @Autowired
    private IAbcFitnessService abcFitnessService;

    @GetMapping("/page")
    public ResponseEntity<Page<AbcFitness>> findAllContact(@PageableDefault(value = 5) Pageable pageable,
                                                           Optional<String> nameSearch) {
        String name = nameSearch.orElse("");
        if (name.equals("null")) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Page<AbcFitness> abcFitnessPage = abcFitnessService.findAllAbcFitnessByKeyword(pageable, name);
        if (abcFitnessPage.isEmpty()) {
            return new ResponseEntity<>(abcFitnessPage, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(abcFitnessPage, HttpStatus.OK);
    }

    //Xóa
    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<AbcFitness> delete(@PathVariable("idDelete") int idDelete) {
        abcFitnessService.deleteAbcFitnessById(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid AbcFitnessDto abcFitnessDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldErrors(), HttpStatus.BAD_REQUEST);
        } else {
            AbcFitness abcFitness = new AbcFitness();
            BeanUtils.copyProperties(abcFitnessDto, abcFitness);
            abcFitnessService.save(abcFitness);
            return new ResponseEntity<>(abcFitness, HttpStatus.CREATED);
        }
    }
}
