package abstractFactory;

public class App {

	public static void main(String[] args) {
		
		Address ad = new AND_AddressBookFactory().createAddress();
		PhoneNumber tf = new AND_AddressBookFactory().createPhoneNumber();
		
		ad.setName("Balmes");
		ad.setNumber(15);
		System.out.println(ad.toString());
		tf.setPhoneNumber("623128");
		System.out.println(tf.toString());
	}
}
