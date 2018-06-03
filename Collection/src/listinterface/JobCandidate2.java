package listinterface;

import java.util.Comparator;

public class JobCandidate2 {
	
	private String name;
	private String gender;
	private int age;
	
	public JobCandidate2(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", age=" + age;
	}
	
	
	static Comparator<JobCandidate2> sortByAgeComparator = new Comparator<JobCandidate2>() {
		
		public int compare(JobCandidate2 o1, JobCandidate2 o2) {
			
			return o1.getAge() > o2.getAge() ? 1 : o1.getAge() <o2.getAge() ? -1 : 0;
		}
	};
	
	static Comparator<JobCandidate2> sortByNameComparator = new Comparator<JobCandidate2>() {
		
		public int compare(JobCandidate2 o1, JobCandidate2 o2) {
			
			return o2.getName().compareTo(o1.getName());
		}
	};
	
	
	
}
