package abstractFactory;

public abstract class PhoneNumber {

	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public abstract String getCountryCode();

	@Override
	public String toString() {
		return "PhoneNumber = (" +getCountryCode()+") "+ phoneNumber ;
	}
	
	
}
