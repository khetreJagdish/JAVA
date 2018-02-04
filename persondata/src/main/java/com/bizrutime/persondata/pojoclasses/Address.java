package com.bizrutime.persondata.pojoclasses;

public class Address 
{
	private String street;
	private String City;
	private int PIN;
	private String State;
	private String Country;

	
	public String getStreet()
	{
		return street;
	}
	public void setStreet(String street)
	{
		this.street = street;
	}
	public String getCity() 
	{
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int PIN) {
		PIN = PIN;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	} 
	
	@Override
	public String toString() 
	{
		
		return "(" + street + ", " + City + ", " + PIN + ", " + State + ", " + Country + ")";
	}
}
