package com.dummy.load.balancer.employee.service.controller;

import com.dummy.load.balancer.employee.service.client.AddressClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final AddressClient addressClient;

    @GetMapping("/{id}")
    public ResponseEntity<String> getEmployeeMockedInformation(@PathVariable("id") Integer id){
        log.info("Incoming request to employee service with id: {}", id.toString());
        String responseMocked = "This is the information of an employee coming from the 'employee-service', \n" +
                "with address random value: " + addressClient.getAddressById(id).getBody();
        return ResponseEntity.ok(responseMocked);
    }

}
