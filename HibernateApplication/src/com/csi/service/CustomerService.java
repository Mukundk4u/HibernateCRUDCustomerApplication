package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.dao.CustomerDaoImpl;

public class CustomerService {
	public static void main(String[] args) {
		
		CustomerDao customerDaoImpl = new CustomerDaoImpl();
		
		//customerDaoImpl.saveCustomerData("Ning", 42154325725L);
		
		//customerDaoImpl.getCustomerDataById(3);
		//customerDaoImpl.updateCustomerData(1, "Ram", 757957572L);
		//customerDaoImpl.deleteCustomerDataById(1);
		customerDaoImpl.deleteAllCustomerData();
		customerDaoImpl.getAllCustomerData();
		
	}

}
