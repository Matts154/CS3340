package assignment;

public class PC1102 {

	public static void main(String[] args) {
		char[] c = {'a', 'b', 'c'};
		
		try {
			Echo.echo(c);
			
			c = null;
			
			Echo.echo(c);
		} catch (MyNullPointerException e){
			e.printStackTrace();
		}
	}

}
