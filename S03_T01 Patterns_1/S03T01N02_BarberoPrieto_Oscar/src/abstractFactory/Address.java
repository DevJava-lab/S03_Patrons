package abstractFactory;

public abstract class Address {

	private String name;
	private int number;

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public abstract String getCountry();

	@Override
	public String toString() {
		return "Address = " + name + ", " + number+" ";
	}

}
