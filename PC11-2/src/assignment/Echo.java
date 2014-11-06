package assignment;

public class Echo {
	public static void echo(char[] cstring) throws MyNullPointerException {
		if(cstring == null) throw new MyNullPointerException();
		
		System.out.println(cstring);
	}
}
