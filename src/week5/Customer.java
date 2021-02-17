package week5;

public class Customer {

	private State noState;
	private State arrivedState;
	private State waitingForTableState;
	private State atTableState;
	private State placingOrderState;
	private State waitingForFoodState;
	private State eatingFoodState;
	private State payingBillState;
	private State leftState;
	
	private State state = noState;
	
	public Customer() {
		noState = new NoState(this);
		arrivedState = new ArrivedState(this);
		waitingForTableState = new WaitingForTableState(this);
		atTableState = new AtTableState(this);
		placingOrderState = new PlacingOrderState(this);
		waitingForFoodState = new WaitingForFoodState(this);
		eatingFoodState = new EatingFoodState(this);
		payingBillState = new PayingBillState(this);
		leftState = new LeftState(this);
		
		state = noState;
	}

	public State getArrivedState() {
		return arrivedState;
	}

	public State getWaitingForTableState() {
		return waitingForTableState;
	}

	public State getAtTableState() {
		return atTableState;
	}

	public State getPlacingOrderState() {
		return placingOrderState;
	}

	public State getWaitingForFoodState() {
		return waitingForFoodState;
	}

	public State getEatingFoodState() {
		return eatingFoodState;
	}

	public State getPayingBillState() {
		return payingBillState;
	}

	public State getLeftState() {
		return leftState;
	}

	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}
