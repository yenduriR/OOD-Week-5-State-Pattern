package week5;

/**
 * A state representing the customer who is at the table.
 * 
 * @author Ramadevi
 *
 */
public class AtTableState implements State {

	private Customer customer;

	public AtTableState(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void welcomeCustomer() {
		System.out.println("< The customer is already welcomed. >");
	}

	@Override
	public void requestToWait() {
		System.out.println("< The customer is already at the table. >");
	}

	@Override
	public void bringToTable() {
		System.out.println("< The customer is already at the table. >");
	}

	@Override
	public void showMenu() {
		System.out.println("Here is the menu. What would you like today?");
		customer.setState(customer.getPlacingOrderState());
	}

	@Override
	public void takeOrder() {
		System.out.println("< The customer is not provided with the menu yet. >");
	}

	@Override
	public void serverFood() {
		System.out.println("< The customer is not provided with the menu yet. >");
	}

	@Override
	public void showBill() {
		System.out.println("< The customer is not provided with the menu yet. >");
	}

	@Override
	public void farewell() {
		System.out.println("Want to lose business?");
	}

}
