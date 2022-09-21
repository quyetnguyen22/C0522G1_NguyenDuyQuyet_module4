package com.casestudy.service.impl.customer;

import com.casestudy.model.customer.Customer;
import com.casestudy.repository.customer.ICustomerRepository;
import com.casestudy.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Page<Customer> showAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer searchById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer editCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer addNewCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}