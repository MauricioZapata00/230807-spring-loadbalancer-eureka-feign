package com.dummy.load.balancer.employee.service.client;

import com.dummy.load.balancer.employee.service.config.CustomLoadBalancer;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-service", url = "http://localhost:8101", path = "/address-service")//,
@LoadBalancerClient(name = "address-service", configuration = CustomLoadBalancer.class)
public interface AddressClient {

    @GetMapping("/address/{id}")
    ResponseEntity<String> getAddressById(@PathVariable("id") Integer id);
}
