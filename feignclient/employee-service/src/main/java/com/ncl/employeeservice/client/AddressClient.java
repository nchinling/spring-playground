package com.ncl.employeeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ncl.employeeservice.response.AddressResponse;

@FeignClient(name = "address-service", url = "http://localhost:8081", path = "/address-service")
public interface AddressClient {
 
    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("id") int id);
 
}
