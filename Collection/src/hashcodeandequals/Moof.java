package hashcodeandequals;

public class Moof {
	
	private int moofValue;
	Moof(int value){
		moofValue = value;
	}
	
	public int getMoofValue() {
		
		return moofValue;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + moofValue;
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moof other = (Moof) obj;
		if (moofValue != other.moofValue)
			return false;
		return true;
	}
	
	
}
