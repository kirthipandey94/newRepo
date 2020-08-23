package com.customerTariff.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerTariff.dao.CustomerTariffDAO;
import com.customerTariff.entity.CustomerTariff;

@Service
public class CustomerTariffServiceImpl implements CustomerTariffService  {

	@Autowired
	private CustomerTariffDAO customerTariffDAO;
	
	@Override
	@Transactional
	public List<CustomerTariff> listCustomers() {
		return customerTariffDAO.listCustomers(); 
	}

	@Override
	@Transactional
	public void saveCustomer(CustomerTariff customerTariff) {
		customerTariffDAO.saveCustomer(customerTariff);
	}

	@Override
	@Transactional
	public CustomerTariff getCustomerTariff(int theId) {
		return customerTariffDAO.getCustomerTariff(theId);
	}

	@Override
	@Transactional
	public void deleteTariffPlan(int theId) {
		customerTariffDAO.deleteTariffPlan(theId);
	}

	
}
