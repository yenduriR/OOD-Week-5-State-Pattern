package week5;

/**
 * A state representing the customer who is waiting for the table.
 * 
 * @author Ramadevi
 *
 */
public class WaitingForTableState implements State {

	private Customer customer;

	public WaitingForTableState(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void welcomeCustomer() {
		System.out.println("< The customer is already welcomed. >");
	}

	@Override
	public void requestToWait() {
		System.out.println("< The customer is already requested to wait for the table. >");
	}

	@Override
	public void bringToTable() {
		System.out.println("Please make yourself comfortable at table #5.");
		customer.setState(customer.getAtTableState());
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
		System.out.println("< Customer has not placed any order yet. >");
	}

	@Override
	public void showBill() {
		System.out.println("< Customer has not placed any order yet. >");
	}

	@Override
	public void farewell() {
		System.out.println("< Want to lose business? >");
	}

}
