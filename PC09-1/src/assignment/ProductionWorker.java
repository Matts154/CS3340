package assignment;

public class ProductionWorker extends Employee {
	private int shift;
	private double payRate;

	public ProductionWorker() {
		super();
		this.shift = 1;
		this.payRate = 0;
	}

	public ProductionWorker(String name, int number, String hireDate, int shift, double payRate) {
		super(name, number, hireDate);
		
		if (shift < 1 && shift > 2)
			this.shift = 1;
		else
			this.shift = shift;
		
		if (payRate >= 9)
			this.payRate = payRate;
		else
			this.payRate = 9;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		if (shift > 0 && shift < 3)
			this.shift = shift;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		if (payRate >= 9)
			this.payRate = payRate;
	}

}
