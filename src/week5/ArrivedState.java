package week5;

/**
 * A state representing the customer who is arrived and welcomed.
 * 
 * @author Ramadevi
 *
 */
public class ArrivedState implements State {

	private Customer customer;

	public ArrivedState(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void welcomeCustomer() {
		System.out.println("< The customer is already welcomed. >");
	}

	@Override
	public void requestToWait() {
		System.out.println("Please wait... we are arranging a table for you.");
		customer.setState(customer.getWaitingForTableState());
	}

	@Override
	public void bringToTable() {
		System.out.println("< The table for customer is not decided yet. >");
	}

	@Override
	public void showMenu() {
		System.out.println("< Let the customer sit at the table first. >");
	}

	@Override
	public void takeOrder() {
		System.out.println("< Let the customer sit at the table first. >");
	}

	@Override
	public void serverFood() {
		System.out.println("< Let the customer sit at the table first. >");
	}

	@Override
	public void showBill() {
		System.out.println("< Let the customer sit at the table first. >");
	}

	@Override
	public void farewell() {
		System.out.println("Want to lose business?");
	}

}
