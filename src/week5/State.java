package week5;

/**
 * An interface for different actions for a customer of a restaurant.
 * 
 * @author Ramadevi
 *
 */
public interface State {

	/**
	 * Action to welcome the customer.
	 */
	public void welcomeCustomer();

	/**
	 * Action to request the customer to wait for the table.
	 */
	public void requestToWait();

	/**
	 * Action to bring the customer to the table.
	 */
	public void bringToTable();

	/**
	 * Action to show the menu to the customer.
	 */
	public void showMenu();

	/**
	 * Action to take the order from the customer.
	 */
	public void takeOrder();

	/**
	 * Action to serve the food.
	 */
	public void serverFood();

	/**
	 * Action to show the bill to the customer.
	 */
	public void showBill();

	/**
	 * Action to farewell.
	 */
	public void farewell();

}
