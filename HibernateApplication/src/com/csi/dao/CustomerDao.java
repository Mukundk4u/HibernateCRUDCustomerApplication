package com.csi.dao;

public interface CustomerDao {

	public void getAllCustomerData();
	
	public void getCustomerDataById(int custId);
	
	public void saveCustomerData(String custName, long custContactNumber);

	public void updateCustomerData(int custId, String custName, long custContactNumber);
	
	public void deleteCustomerDataById(int custId);
	
	public void deleteAllCustomerData();
	
}
