package com.exemple.foodiecli.repository;

import java.util.List;
import java.util.Optional;

import com.exemple.foodiecli.model.Customer;
import com.exemple.foodiecli.util.CsvReader;

public class CustomerRepository {
	
	private List<Customer> customerList;
	
	public CustomerRepository() {
		
		CsvReader csvReader = new CsvReader();
		this.customerList = csvReader.readCustomerCSV();
	}
	
	public List<Customer> getAllCustomers(){
		return this.customerList;
	}
	
	public Customer saveCustomer(Customer customer) {
		this.customerList.add(customer);
		return customer;
	}
	
	public Optional<Customer> findCustomerById(String id){
		return this.customerList.stream().filter(customer -> customer.getId().equals(id)).findFirst();
	}
}
