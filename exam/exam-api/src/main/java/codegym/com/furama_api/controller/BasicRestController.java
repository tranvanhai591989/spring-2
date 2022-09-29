package codegym.com.furama_api.controller;

import codegym.com.furama_api.dto.BasicDto;
import codegym.com.furama_api.model.Basic;
import codegym.com.furama_api.model.Employee;
import codegym.com.furama_api.service.IBasicService;
import codegym.com.furama_api.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/fitness")
public class BasicRestController {
    @Autowired
    IBasicService basicService;

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("/basic/list")
    public ResponseEntity<List<Basic>> basicList() {
        List<Basic> basicList = basicService.findAll();
        if (basicList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(basicList, HttpStatus.OK);
    }

    @GetMapping("/employee/list")
    public ResponseEntity<List<Employee>> employeeList() {
        List<Employee> employeeList = employeeService.findAll();
        if (employeeList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @PostMapping("/basic/create")
    public ResponseEntity<List<Basic>> create(@RequestBody @Valid BasicDto basicDto, BindingResult bindingResult) {
        Basic basic = new Basic();
        BeanUtils.copyProperties(basicDto, basic);
        this.basicService.save(basic);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("basic/delete/{idDelete}")
    public ResponseEntity<Basic> delete(@PathVariable("idDelete") int idDelete) {
        basicService.delete(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Basic>> findById(@PathVariable Integer id) {
        Optional<Basic> basic = basicService.findById(id);
        if (!basic.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(basic, HttpStatus.OK);
    }

}
