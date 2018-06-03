package collection;

public class Company {
	
	int companyId;
	String companyName;
	
	public Company(int companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	@Override
	public String toString() {
		
		return "Company Name : "+this.getCompanyName() + " \nCompany ID : " + this.getCompanyId();
	}
}
