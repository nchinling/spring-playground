package com.ncl.employeeservice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ncl.employeeservice.client.AddressClient;
import com.ncl.employeeservice.entity.Employee;
import com.ncl.employeeservice.repository.EmployeeRepository;
import com.ncl.employeeservice.response.AddressResponse;
import com.ncl.employeeservice.response.EmployeeResponse;

@Service

public class EmployeeService {
 
    @Autowired
    private EmployeeRepository employeeRepo;
 
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private AddressClient addressClient;
 

    public EmployeeResponse getEmployeeById(int id) {

        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);

        // Using FeignClient
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse.getBody());

        return employeeResponse;

    }
 
}
