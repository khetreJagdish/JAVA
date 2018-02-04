package com.bizrutime.persondata.pojoclasses;

import java.util.List;

public class Person 
{
	
	private String pan;
	private String firstname;
	private String lastname;
	private int age;
	private long phone;
	private String nationality;
	private List<Address> addr ;
	private List<Company> coman;
	private List<String> lang;
	
	public List<Address> getAddr() 
	{
		return addr;
	}
	public void setAddr(List<Address> addr) 
	{
		this.addr = addr;
	}
	public List<Company> getComan() 
	{
		return coman;
	}
	public void setComan(List<Company> coman) 
	{
		this.coman = coman;
	}
	public List<String> getLang() {
		return lang;
	}
	public void setLang(List<String> lang) {
		this.lang = lang;
	}


	
	
	public String getPan() 
	{
		return pan;
	}
	public void setPan(String pan) 
	{
		this.pan = pan;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public long getPhone() 
	{
		return phone;
	}
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	public String getNationality() 
	{
		return nationality;
	}
	public void setNationality(String nationality) 
	{
		this.nationality = nationality;
	}
	
	
	@Override
	public String toString() 
	{
		return "(" + pan + ", " + firstname + ", " + lastname + ", " + age + ", " + phone + ", " + nationality + ")";
	}
}
