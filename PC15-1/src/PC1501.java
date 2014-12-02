import java.nio.file.Paths;
import java.util.Scanner;

public class PC1501 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a file location: ");
		
		try ( Scanner inputFile = new Scanner(Paths.get(input.nextLine())) ) {
			String substring;
			int count = 0;
			int lineNum = 1;
			
			System.out.print("Enter a string to search for: ");
			substring = input.nextLine();
			
			System.out.print("Occurs at line(s): ");
			
			while(inputFile.hasNextLine()) {
				String s = inputFile.nextLine();
				
				if(s.contains(substring)){
					System.out.printf("%d ", lineNum);
					++count;
				}
				
				++lineNum;
			}
			
			System.out.printf("%nNumber of occurances: %d", count);
			
			inputFile.close();
		}
		catch (Exception e) {
			System.out.printf("Error: %s%n", e.getCause());
		}
		finally {
			input.close();
		}
		
	}
	
}
