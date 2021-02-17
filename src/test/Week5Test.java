package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week5.Customer;
import week5.Restaurant;

class Week5Test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	void test() throws IOException {

		// =============== //
		// TEST ERROR FLOW //
		// =============== //

		Customer customer = new Customer();
		Restaurant restaurant = new Restaurant(customer);

		restaurant.farewell();
		assertEquals("< There is no customer to farewell. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		restaurant.requestToWait();
		assertEquals("< There is no customer to request to wait. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();

		restaurant.bringToTable();
		assertEquals("< There is no customer to bring to the table. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.showMenu();
		assertEquals("< There is no customer to show the menu. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.takeOrder();
		assertEquals("< There is no customer to take the order from. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();

		restaurant.serverFood();
		assertEquals("< There is no customer to sever the food. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.showBill();
		assertEquals("< There is no customer to show the bill. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.welcomeCustomer();
		assertEquals("We warmly welcome you to our restaurant." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		restaurant.welcomeCustomer();
		assertEquals("< The customer is already welcomed. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.bringToTable();
		assertEquals("< The table for customer is not decided yet. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		restaurant.showMenu();
		assertEquals("< Let the customer sit at the table first. >" + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		restaurant.requestToWait();
		assertEquals("Please wait... we are arranging a table for you." + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.requestToWait();
		assertEquals("< The customer is already requested to wait for the table. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.farewell();
		assertEquals("< Want to lose business? >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.bringToTable();
		assertEquals("Please make yourself comfortable at table #5." + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.bringToTable();
		assertEquals("< The customer is already at the table. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.takeOrder();
		assertEquals("< The customer is not provided with the menu yet. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.showMenu();
		assertEquals("Here is the menu. What would you like today?" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.showMenu();
		assertEquals("< The customer is already provided with the menu. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.serverFood();
		assertEquals("< The customer has not placed an order yet. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.takeOrder();
		assertEquals("Thank you for the order. Your food will be on your table soon." + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.takeOrder();
		assertEquals("< The customer has already placed an order. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.showBill();
		assertEquals("< Let the customer eat first. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.serverFood();
		assertEquals("Here is your delicious food." + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.serverFood();
		assertEquals("< The food is already served. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.showBill();
		assertEquals("Here is your bill." + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.showBill();
		assertEquals("< The customer has already paid the bill. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.farewell();
		assertEquals("Hope you enjoyed the experience. Good Bye!" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();
		
		restaurant.farewell();
		assertEquals("< The customer is already left. >" + System.lineSeparator(),
				outContent.toString());
		outContent.reset();

		
		// ================ //
		// TEST NORMAL FLOW //
		// ================ //

		customer = new Customer();
		restaurant = new Restaurant(customer);

		restaurant.welcomeCustomer();
		assertEquals("We warmly welcome you to our restaurant." + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.requestToWait();
		assertEquals("Please wait... we are arranging a table for you." + System.lineSeparator(),
				outContent.toString());
		outContent.reset();

		restaurant.bringToTable();
		assertEquals("Please make yourself comfortable at table #5." + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.showMenu();
		assertEquals("Here is the menu. What would you like today?" + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.takeOrder();
		assertEquals("Thank you for the order. Your food will be on your table soon." + System.lineSeparator(),
				outContent.toString());
		outContent.reset();

		restaurant.serverFood();
		assertEquals("Here is your delicious food." + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.showBill();
		assertEquals("Here is your bill." + System.lineSeparator(), outContent.toString());
		outContent.reset();

		restaurant.farewell();
		assertEquals("Hope you enjoyed the experience. Good Bye!" + System.lineSeparator(), outContent.toString());
		outContent.reset();


	}

}
