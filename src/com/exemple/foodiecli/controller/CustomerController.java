package com.exemple.foodiecli.controller;

import com.exemple.foodiecli.exceptions.CustomerExistException;
import com.exemple.foodiecli.model.Customer;
import com.exemple.foodiecli.service.CustomerServiceImpl;

public class CustomerController {

	private CustomerServiceImpl customerService;
	
	public CustomerController(CustomerServiceImpl customerService) {
		this.customerService = customerService;
	}
	
	public Customer saveCustomer(Customer customer) throws CustomerExistException{
		return this.customerService.saveCustomer(customer);
	}
	
}
