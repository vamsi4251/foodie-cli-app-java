package com.exemple.foodiecli.service;

import com.exemple.foodiecli.exceptions.CustomerExistException;
import com.exemple.foodiecli.model.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer) throws CustomerExistException;

}
