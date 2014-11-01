package assignment;

public class CruiseShip extends Ship {
	private int maxPassengers;

	public CruiseShip() {
		super();
		this.maxPassengers = 0;
	}

	public CruiseShip(String name, String year, int maxPassengers) {
		super(name, year);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public void print() {
		System.out.printf("Name: %s%nMaximum Capacity: %s passenger(s)%n", this.getName(), maxPassengers);
	}

}
