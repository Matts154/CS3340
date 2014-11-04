/*
 * Matthew Stephenson
 * CS 3340 - PC1002
 * November 6th, 2014
 */


/*
 * Interface MonsterName
 */
interface Name {
	public void setName(String name);
	public String getName();
}

/*
 * Abstract class Monster
 */
abstract class Monster {
	String name;
	
	public abstract void shout();
	
}

/*
 * Class Orc
 */
class Orc extends Monster implements Name {

	public Orc() {
		this.name = "";
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void shout() {
		System.out.println("Werk werk.");

	}

}

/*
 * Class Ferret 
 */
class Ferret implements Name {
	String name;
	
	public Ferret(){
		
	}
	
	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}	
	
}

/*
 * Main driver class
 */
public class PC1002 {

	public static void main(String[] args) {
		Name names[] = { new Orc(), new Ferret() };
		
		names[0].setName("Smash");
		names[1].setName("Chester");
		
		for(Name object : names){
			System.out.printf("%s name is %s%n", object.getClass().getName(), object.getName());
		}

	}

}