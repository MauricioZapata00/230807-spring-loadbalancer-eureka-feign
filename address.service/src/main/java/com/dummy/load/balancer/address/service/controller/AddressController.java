package com.dummy.load.balancer.address.service.controller;

import com.dummy.load.balancer.address.service.utils.RandomIntegerGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getEmployeeAddress(@PathVariable("id") Integer id){
        log.info("Incoming request to address service with id: {}", id.toString());
        String stringToReturn = "Plain information from 'address-service', generating value of: \n" +
                RandomIntegerGenerator.generateRandomNumber();
        return ResponseEntity.ok(stringToReturn);
    }
}
