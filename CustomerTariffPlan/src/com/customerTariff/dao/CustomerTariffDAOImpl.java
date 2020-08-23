package com.customerTariff.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customerTariff.entity.CustomerTariff;


@Repository
public class CustomerTariffDAOImpl implements CustomerTariffDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<CustomerTariff> listCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<CustomerTariff> theQuery = 
				currentSession.createQuery("from CustomerTariff",CustomerTariff.class);
		List<CustomerTariff> result = theQuery.getResultList();
		return result;
		
	}

	@Override
	public void saveCustomer(CustomerTariff customerTariff) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(customerTariff);
		
	}

	@Override
	public CustomerTariff getCustomerTariff(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		CustomerTariff customerTariff = currentSession.get(CustomerTariff.class,theId);
		return customerTariff;
	}

	@Override
	public void deleteTariffPlan(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from CustomerTariff where id=:id");
		theQuery.setParameter("id", theId);
		theQuery.executeUpdate();
		
	}

	
}
