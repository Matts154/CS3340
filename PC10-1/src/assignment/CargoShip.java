package assignment;

public class CargoShip extends Ship {
	private int maxCargo;
	
	public CargoShip() {
		super();
		this.maxCargo = 0;
	}

	public CargoShip(String name, String year, int maxCargo) {
		super(name, year);
		this.maxCargo = maxCargo;
	}

	public int getMaxCargo() {
		return maxCargo;
	}

	public void setMaxCargo(int maxCargo) {
		this.maxCargo = maxCargo;
	}
	
	@Override
	public void print() {
		System.out.printf("CargoShip Name: %s%nMaximum Load: %s tonnes%n", this.getName(), maxCargo);
	}
}
