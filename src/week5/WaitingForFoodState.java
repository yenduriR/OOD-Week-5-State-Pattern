package week5;

/**
 * A state representing the customer who is waiting for the food.
 * 
 * @author Ramadevi
 *
 */
public class WaitingForFoodState implements State {

	private Customer customer;

	public WaitingForFoodState(Customer customer) {
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
		System.out.println("Here is your delicious food.");
		customer.setState(customer.getEatingFoodState());
	}

	@Override
	public void showBill() {
		System.out.println("< Let the customer eat first. >");
	}

	@Override
	public void farewell() {
		System.out.println("Want to lose business?");
	}

}
