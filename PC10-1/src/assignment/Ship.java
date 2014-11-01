package assignment;

public class Ship {
	private String name;
	private String year;
	
	public Ship() {
		this.name = "";
		this.year = "";
	}

	public Ship(String name, String year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public void print() {
		System.out.printf("%s (%s)%n", name, year);
	}
}
