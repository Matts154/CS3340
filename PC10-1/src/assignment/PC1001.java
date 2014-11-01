package assignment;

public class PC1001 {

	public static void main(String[] args) {
		Ship[] ship = { new Ship("USS Unsinkable II", "2000"), 
						new CruiseShip("RMS Titanic", "1912", 3327),
						new CargoShip("USS Big Man", "1989", 123456) };
		
		for(int i = 0; i < ship.length; i++) {
			System.out.printf("SHIP #%d:%n", i);
			ship[i].print();
			System.out.printf("%n");
		}

	}

}
