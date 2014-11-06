package assignment;

public class PC1102 {

	public static void main(String[] args) {
		try {
			Echo.echo("aA bB cC".toCharArray());
			Echo.echo(null);
		} catch (MyNullPointerException e){
			e.printStackTrace();
		}
	}

}
