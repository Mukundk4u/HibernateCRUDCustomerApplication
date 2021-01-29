package com.csi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "cust_id")
	int custId;
	
	@Column(name= "cust_name")
	String custName;
	
	@Column(name= "cust_contact_number", unique = true)
	long custContactNumber;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custContactNumber=" + custContactNumber
				+ "]";
	}
	
	

}
