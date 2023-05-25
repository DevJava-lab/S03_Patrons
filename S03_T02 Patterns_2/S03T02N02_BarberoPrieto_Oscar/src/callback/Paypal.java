package callback;

public class Paypal implements Payment {

	private String compte;
	private String pass;

	public Paypal(String compte, String pass) {
		super();
		this.compte = compte;
		this.pass = pass;
	}

	public String getCompte() {
		return compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public void pay() {
		System.out.println("Has fet un pagament amb Paypal.");

	}

}
