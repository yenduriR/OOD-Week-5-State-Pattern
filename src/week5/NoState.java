package week5;

/**
 * A state representing the customer who is not welcome yet.
 * 
 * @author Ramadevi
 *
 */
public class NoState implements State {

	private Customer customer;

	public NoState(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void welcomeCustomer() {
		System.out.println("We warmly welcome you to our restaurant.");
		customer.setState(customer.getArrivedState());
	}

	@Override
	public void requestToWait() {
		System.out.println("< There is no customer to request to wait. >");
	}

	@Override
	public void bringToTable() {
		System.out.println("< There is no customer to bring to the table. >");
	}

	@Override
	public void showMenu() {
		System.out.println("< There is no customer to show the menu. >");
	}

	@Override
	public void takeOrder() {
		System.out.println("< There is no customer to take the order from. >");
	}

	@Override
	public void serverFood() {
		System.out.println("< There is no customer to sever the food. >");

	}

	@Override
	public void showBill() {
		System.out.println("< There is no customer to show the bill. >");

	}

	@Override
	public void farewell() {
		System.out.println("< There is no customer to farewell. >");
	}

}
