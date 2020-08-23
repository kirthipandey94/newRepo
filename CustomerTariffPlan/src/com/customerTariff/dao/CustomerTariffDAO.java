package com.customerTariff.dao;

import java.util.List;

import com.customerTariff.entity.CustomerTariff;

public interface CustomerTariffDAO {
	
	public List<CustomerTariff> listCustomers();

	public void saveCustomer(CustomerTariff customerTariff);

	public CustomerTariff getCustomerTariff(int theId);

	public void deleteTariffPlan(int theId);
	
}
