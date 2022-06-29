package com.nikpa.springdemo.dao;

import java.util.List;

import com.nikpa.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> getCustomers(String theSearchName);

	public List<Customer> getCustomers(int theSortField);
}
