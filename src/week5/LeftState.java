package week5;

/**
 * A state representing the customer who has left the restaurant.
 * 
 * @author Ramadevi
 *
 */
public class LeftState implements State {

	private Customer customer;

	public LeftState(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void welcomeCustomer() {
		System.out.println("< The customer is already left. >");
	}

	@Override
	public void requestToWait() {
		System.out.println("< The customer is already left. >");
	}

	@Override
	public void bringToTable() {
		System.out.println("< The customer is already left. >");
	}

	@Override
	public void showMenu() {
		System.out.println("< The customer is already left. >");
	}

	@Override
	public void takeOrder() {
		System.out.println("< The customer is already left. >");
	}

	@Override
	public void serverFood() {
		System.out.println("< The customer is already left. >");
	}

	@Override
	public void showBill() {
		System.out.println("< The customer is already left. >");
	}

	@Override
	public void farewell() {
		System.out.println("< The customer is already left. >");
	}

}
