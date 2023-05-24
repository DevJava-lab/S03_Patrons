package abstractFactory;


public class ESP_Address extends Address {

	private static final String COUNTRY = "ESPANYA";

	@Override
	public String getCountry() {

		return COUNTRY;

	}

	@Override
	public String toString() {
		return super.toString() + COUNTRY;
	}

}
