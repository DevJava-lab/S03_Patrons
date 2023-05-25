package callback;

public class Card implements Payment {

	private String num;

	public Card(String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public void pay() {
		System.out.println("Has fet un pagament amb la teva tarjeta dèbit.");

	}

}
