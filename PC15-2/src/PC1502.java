import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PC1502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Path path;
		
		System.out.print("Enter a directory: ");
		path = Paths.get(input.nextLine());
		
		input.close();

		if (Files.isDirectory(path)) {
			
			try (DirectoryStream<Path> directories = Files.newDirectoryStream(path)){
				System.out.printf("   %-35s %15s %-22s%n", "Filename", "Size", "Modified");

				for(Path p : directories){
					System.out.printf("%s%s %-35s %15d %-22s%n", 
							(Files.isDirectory(p) ? "D" : "-"),
							(p.isAbsolute() ? "A" : "-"),
							p.toString(),
							Files.size(p),
							Files.getLastModifiedTime(p));
				}
				
				directories.close();
			} catch (IOException e) {
				System.out.printf("%nError: %s", e.getCause() );
			}
			
		}
		
	}

}
