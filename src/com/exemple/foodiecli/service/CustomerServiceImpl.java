package com.exemple.foodiecli.service;

import java.util.Optional;

import com.exemple.foodiecli.exceptions.CustomerExistException;
import com.exemple.foodiecli.model.Customer;
import com.exemple.foodiecli.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override 
	public Customer saveCustomer(Customer customer) throws CustomerExistException {
		// if customer already exists (id,name,email) then throws CustomerExistsException
		//else save customer in the repository
		
		Optional<Customer> customerById  =this.customerRepository.findCustomerById(customer.getId());
		if(customerById.isPresent()) {
			throw new CustomerExistException("Customer already Exist with this ID");
		}
		return this.customerRepository.saveCustomer(customer);
	}

}
