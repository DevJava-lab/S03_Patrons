package abstractFactory;


public class ESP_AddressBookFactory implements AddressBookFactory{

	public Address createAddress() {
		
		return new ESP_Address();
	}

	public PhoneNumber createPhoneNumber() {
	
		return new ESP_PhoneNumber();
	}
	
	

}
