package callback;

public class ShoeShop {
	
	private PaymentGateway sale;

	public ShoeShop() {
		
		sale=new PaymentGateway();
	}
	
	public void sell(Payment method) {
		
		sale.wayToPay(method);
	}

}
