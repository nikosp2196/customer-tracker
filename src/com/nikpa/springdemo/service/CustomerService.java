package com.nikpa.springdemo.service;

import java.util.List;

import com.nikpa.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer customer);

	public Customer getCustomer(int theId);
	
	public List<Customer> getCustomers(String theSearchName);
	
	public void deleteCustomer(int theId);

	public List<Customer> getCustomers(int theSortField);

	
}
