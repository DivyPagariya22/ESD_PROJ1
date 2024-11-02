package com.divy.esdtestingprogram.mapper;

import com.divy.esdtestingprogram.dto.CustomerRequest;
import com.divy.esdtestingprogram.dto.CustomerResponse;
import com.divy.esdtestingprogram.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .address(request.address()) // Add address
                .city(request.city())       // Add city
                .pincode(request.pincode()) // Add pincode
                .build();
    }

    public CustomerResponse toCustomerResponse(Customer customer) {
        return new CustomerResponse(customer.getFirstName(), customer.getLastName(), customer.getEmail());
    }
}
