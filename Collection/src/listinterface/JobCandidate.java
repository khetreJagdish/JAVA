package listinterface;

public class JobCandidate implements Comparable<JobCandidate>{
	
	private String name;
	private String gender;
	private int age;
	
	public JobCandidate(String name, String gender, int age) {
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
		return "JobCandidate [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	/** Sorting by age*/
	public int compareTo(JobCandidate candidate) {
		
		return (this.getAge() > candidate.getAge() ? 1 : (this.getAge() < candidate.getAge() ? -1 : 0));
	}
	
	
	
	
	
}
