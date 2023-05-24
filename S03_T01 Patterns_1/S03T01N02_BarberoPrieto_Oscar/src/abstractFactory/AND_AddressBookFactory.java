package abstractFactory;

public class AND_AddressBookFactory implements AddressBookFactory{

	public Address createAddress() {
		
		return new AND_Address();
	}

	public PhoneNumber createPhoneNumber() {
	
		return new AND_PhoneNumber();
	}
	
	

}
