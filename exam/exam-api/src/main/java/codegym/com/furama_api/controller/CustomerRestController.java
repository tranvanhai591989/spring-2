package codegym.com.furama_api.controller;

import codegym.com.furama_api.model.Customer;
import codegym.com.furama_api.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    ICustomerService customerService;

    @GetMapping("/page")
    public ResponseEntity<Page<Customer>> showAll(@PageableDefault(3) Pageable pageable, Optional<String> keyWord) {
        {
            String name = keyWord.orElse("");
            Page<Customer> customerPage = customerService.findAll(pageable, name);
            if (customerPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(customerPage, HttpStatus.OK);
        }
    }


    @GetMapping("/list")
    public ResponseEntity<List<Customer>> customerList() {
        List<Customer> customerList = customerService.findAllC();
        if (customerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

}
