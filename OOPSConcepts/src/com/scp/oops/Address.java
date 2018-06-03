package com.scp.oops;

public class Address {
	private int streetId;
	private String city;
	private String state;
	public int getStreetId() {
		return streetId;
	}
	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "\n\nAddress [streetId=" + streetId + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
