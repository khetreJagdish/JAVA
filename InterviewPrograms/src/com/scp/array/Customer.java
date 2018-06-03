package com.scp.array;

import java.util.Arrays;

public class Customer {
	private int cusId;
	private String custName;
	
	
	
	public Customer(int cusId, String custName) {
		super();
		this.cusId = cusId;
		this.custName = custName;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", custName=" + custName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cusId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (cusId != other.cusId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		return true;
	}
	
}
