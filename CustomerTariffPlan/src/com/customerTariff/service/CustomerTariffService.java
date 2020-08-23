package com.customerTariff.service;

import java.util.List;

import com.customerTariff.entity.CustomerTariff;

public interface CustomerTariffService {

	public List<CustomerTariff> listCustomers();

	public void saveCustomer(CustomerTariff customerTariff);

	public CustomerTariff getCustomerTariff(int theId);

	public void deleteTariffPlan(int theId);
	
}
