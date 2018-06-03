package com.scp.oops;

public class Client {
	public static void main(String[] args) {
		
		Person person = new Person();
		Person2 person2 = new Person2();
		
		Address address = new Address();
		address.setStreetId(1234);
		address.setState("MH");
		address.setCity("Pune");
		
		person.setPersonId(1);
		person.setPersonName("Jagdsih");
		person.setAddress(address);
		
		
		person2.setPerson2Id(2);
		person2.setPerson2Name("Samir");
		person2.setAddress(address);
		
		System.out.println(person);
		System.out.println(person2);
		
	}
}
