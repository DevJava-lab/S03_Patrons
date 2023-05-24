package abstractFactory;


public interface AddressBookFactory {
	
	Address createAddress();
	PhoneNumber createPhoneNumber();

}
