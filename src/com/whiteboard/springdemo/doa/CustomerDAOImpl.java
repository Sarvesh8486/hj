package com.whiteboard.springdemo.doa;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.whiteboard.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		Session session = this.sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> customerList =  query.getResultList();
		return customerList;
	}
	
}
