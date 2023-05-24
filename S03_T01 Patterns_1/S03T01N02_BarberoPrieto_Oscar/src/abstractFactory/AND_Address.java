package abstractFactory;


public class AND_Address extends Address {

	private static final String COUNTRY = "ANDORRA";

	@Override
	public String getCountry() {

		return COUNTRY;

	}

	@Override
	public String toString() {
		return super.toString() + COUNTRY;
	}

}
