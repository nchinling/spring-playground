package com.ncl.addressservice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncl.addressservice.entity.Address;
import com.ncl.addressservice.repository.AddressRepository;
import com.ncl.addressservice.response.AddressResponse;

@Service
public class AddressService {
 
    @Autowired
    private AddressRepository addressRepo;
 
    @Autowired
    private ModelMapper mapper;
 
    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
        return addressResponse;
    }
 
}