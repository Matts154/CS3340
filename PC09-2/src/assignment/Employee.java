package assignment;

public class Employee {
	private String name;
	private int number;
	private String hireDate;

	public Employee() {
		name = "";
		number = -1;
		hireDate = "";
	}

	public Employee(String name, int number, String hireDate) {
		this.name = name;
		this.number = number;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number > 0)
			this.number = number;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

}
