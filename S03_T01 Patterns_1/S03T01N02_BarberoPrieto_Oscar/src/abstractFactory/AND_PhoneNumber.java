package abstractFactory;


public class AND_PhoneNumber extends PhoneNumber {

	private static final String CODE = "376";
	private static final int LENGTH = 6;

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
