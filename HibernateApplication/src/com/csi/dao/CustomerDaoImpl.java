package com.csi.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.csi.model.Customer;

public class CustomerDaoImpl implements CustomerDao{

	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	@Override
	public void getAllCustomerData() {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		List<Customer> custList = session.createQuery("from Customer").list();
		custList.forEach(System.out::println);
		
	}

	@Override
	public void getCustomerDataById(int custId) {
		// TODO Auto-generated method stub
	
		Session session = factory.openSession();
		List<Customer> custList = session.createQuery("from Customer").list();
		
		for(Customer c : custList)
		{
			if(c.getCustId() == custId) {
				System.out.println(c);
			}
			
		}
	}

	@Override
	public void saveCustomerData(String custName, long custContactNumber) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer cc = new Customer();
		cc.setCustName(custName);
		cc.setCustContactNumber(custContactNumber);
		session.save(cc);
		transaction.commit();
	
	}

	@Override
	public void updateCustomerData(int custId, String custName, long custContactNumber) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer cc = new Customer();
		List<Customer> custList = session.createQuery("from Customer").list();
				
				for(Customer c : custList)
				{
					if(c.getCustId() == custId) {
						c.setCustName(custName);
						c.setCustContactNumber(custContactNumber);
						session.update(c);
						transaction.commit();
					}
					
				}
	}

	@Override
	public void deleteCustomerDataById(int custId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer cc = new Customer();
		List<Customer> custList = session.createQuery("from Customer").list();
				
				for(Customer c : custList)
				{
					if(c.getCustId() == custId) {
						
						session.delete(c);
						transaction.commit();
					}
					
				}
	}

	@Override
	public void deleteAllCustomerData() {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		
		List<Customer> custList = session.createQuery("from Customer").list();
		for(Customer c : custList)
			{
				Transaction transaction = session.beginTransaction();
				session.delete(c);
				transaction.commit();
					
			}
	}

}
