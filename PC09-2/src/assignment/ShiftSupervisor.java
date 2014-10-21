package assignment;

public class ShiftSupervisor extends Employee {
	private double salary;
	private double bonus;

	public ShiftSupervisor() {
		this.salary = 0;
		this.bonus = 0;
	}

	public ShiftSupervisor(String name, int number, String hireDate, double salary, double bonus) {
		super(name, number, hireDate);
		
		if(salary < 0)
			this.salary = 0;
		else
			this.salary = salary;
		
		if(bonus < 0)
			this.bonus = 0;
		else
			this.bonus = bonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
