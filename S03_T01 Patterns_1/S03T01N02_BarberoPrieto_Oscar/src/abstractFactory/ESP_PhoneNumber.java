package abstractFactory;


public class ESP_PhoneNumber extends PhoneNumber {

	private static final String CODE = "34";
	private static final int LENGTH = 9;

	@Override
	public String getCountryCode() {

		return CODE;
	}

	public void setPhoneNumber(String number) {

		if (number.length() == LENGTH) {
			super.setPhoneNumber(number);
		}
	}

}
