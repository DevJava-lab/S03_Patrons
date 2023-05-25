package callback;

public class App {

	public static void main(String[] args) {

		Bank bk = new Bank("67489132495321AC", "1234");
		Card cd = new Card("97540165194-43");
		Paypal py = new Paypal("719530fu541", "4567");

		ShoeShop store = new ShoeShop();

		store.sell(bk);
		store.sell(cd);
		store.sell(py);

	}

}
