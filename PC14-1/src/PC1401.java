import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PC1401 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pattern expression = Pattern.compile("b[a-zA-Z]*");
		
		System.out.print("Enter a string to tokenize: ");
		
		Matcher matcher = expression.matcher( input.nextLine() );

		System.out.println("Tokens starting with \'b\'");
		
		while(matcher.find())
			System.out.println(matcher.group());

		input.close();

	}
}
