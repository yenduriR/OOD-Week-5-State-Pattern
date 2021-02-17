package week5;

/**
 * A class representing a restaurant that serves the customers based on the
 * customer states. The restaurant can handle a single customer only (developed
 * for demo purpose). It has different methods to manage the customer and each
 * of them delegate the task to different child objects of State interface.
 * 
 * @author Ramadevi
 *
 */
public class Restaurant {

	private Customer customer;

	public Restaurant(Customer customer) {
		this.customer = customer;
	}

	public void welcomeCustomer() {
		this.customer.getState().welcomeCustomer();
	}

	public void requestToWait() {
		this.customer.getState().requestToWait();
	}

	public void bringToTable() {
		this.customer.getState().bringToTable();
	}

	public void showMenu() {
		this.customer.getState().showMenu();
	}

	public void takeOrder() {
		this.customer.getState().takeOrder();
	}

	public void serverFood() {
		this.customer.getState().serverFood();
	}

	public void showBill() {
		this.customer.getState().showBill();
	}

	public void farewell() {
		this.customer.getState().farewell();
	}

}
