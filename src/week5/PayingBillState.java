package week5;

/**
 * A state representing the customer who is paying the bill.
 * 
 * @author Ramadevi
 *
 */
public class PayingBillState implements State {

	private Customer customer;

	public PayingBillState(Customer customer) {
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
		System.out.println("< The customer has already placed an order. >");
	}

	@Override
	public void serverFood() {
		System.out.println("< The food is already served. >");
	}

	@Override
	public void showBill() {
		System.out.println("< The customer has already paid the bill. >");
	}

	@Override
	public void farewell() {
		System.out.println("Hope you enjoyed the experience. Good Bye!");
		customer.setState(customer.getLeftState());
	}

}
