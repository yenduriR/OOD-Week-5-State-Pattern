package week5;

/**
 * A state representing the customer who is placing an order.
 * 
 * @author Ramadevi
 *
 */
public class PlacingOrderState implements State {

	private Customer customer;

	public PlacingOrderState(Customer customer) {
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
		System.out.println("< The customer is already provided with the menu. >");
	}

	@Override
	public void takeOrder() {
		System.out.println("Thank you for the order. Your food will be on your table soon.");
		customer.setState(customer.getWaitingForFoodState());
	}

	@Override
	public void serverFood() {
		System.out.println("< The customer has not placed an order yet. >");
	}

	@Override
	public void showBill() {
		System.out.println("< The customer has not placed an order yet. >");
	}

	@Override
	public void farewell() {
		System.out.println("< Want to lose business? >");
	}

}
