package com.scp.oops;

public class Person2 {
	
	private int person2Id;
	private String person2Name;
	private Address address;
	public int getPerson2Id() {
		return person2Id;
	}
	public void setPerson2Id(int person2Id) {
		this.person2Id = person2Id;
	}
	public String getPerson2Name() {
		return person2Name;
	}
	public void setPerson2Name(String person2Name) {
		this.person2Name = person2Name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person2 [person2Id=" + person2Id + ", person2Name=" + person2Name + ", address=" + address + "]";
	}
	
	
	
}
