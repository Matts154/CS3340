import java.util.Scanner;

class PC1402 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String plainText;
		StringBuilder moroseCode = new StringBuilder();
		
		System.out.print("Enter a string: ");
		plainText = input.nextLine();
		
		for (int i = 0; i < plainText.length(); i++) {
			switch (plainText.charAt(i)) {
				case 'A':
				case 'a':
					moroseCode.append(".- ");
					break;
				case 'B':
				case 'b':
					moroseCode.append("-... ");
					break;
				case 'C':
				case 'c':
					moroseCode.append("-.-. ");
					break;
				case 'D':
				case 'd':
					moroseCode.append("-.. ");
					break;
				case 'E':
				case 'e':
					moroseCode.append(". ");
					break;
				case 'F':
				case 'f':
					moroseCode.append("..-. ");
					break;
				case 'G':
				case 'g':
					moroseCode.append("--. ");
					break;
				case 'H':
				case 'h':
					moroseCode.append(".... ");
					break;
				case 'I':
				case 'i':
					moroseCode.append(".. ");
					break;
				case 'J':
				case 'j':
					moroseCode.append(".--- ");
					break;
				case 'K':
				case 'k':
					moroseCode.append("-.- ");
					break;
				case 'L':
				case 'l':
					moroseCode.append(".-.. ");
					break;
				case 'M':
				case 'm':
					moroseCode.append("-- ");
					break;
				case 'N':
				case 'n':
					moroseCode.append("-. ");
					break;
				case 'O':
				case 'o':
					moroseCode.append("--- ");
					break;
				case 'P':
				case 'p':
					moroseCode.append(".--. ");
					break;
				case 'Q':
				case 'q':
					moroseCode.append("--.- ");
					break;
				case 'R':
				case 'r':
					moroseCode.append(".-. ");
					break;
				case 'S':
				case 's':
					moroseCode.append("... ");
					break;
				case 'T':
				case 't':
					moroseCode.append("- ");
					break;
				case 'U':
				case 'u':
					moroseCode.append("..- ");
					break;
				case 'V':
				case 'v':
					moroseCode.append("...- ");
					break;
				case 'W':
				case 'w':
					moroseCode.append(".-- ");
					break;
				case 'X':
				case 'x':
					moroseCode.append("-..- ");
					break;
				case 'Y':
				case 'y':
					moroseCode.append("-.-- ");
					break;
				case 'Z':
				case 'z':
					moroseCode.append("--.. ");
					break;
				case '1':
					moroseCode.append(".---- ");
					break;
				case '2':
					moroseCode.append("..--- ");
					break;
				case '3':
					moroseCode.append("...-- ");
					break;
				case '4':
					moroseCode.append("....- ");
					break;
				case '5':
					moroseCode.append("..... ");
					break;
				case '6':
					moroseCode.append("-.... ");
					break;
				case '7':
					moroseCode.append("--... ");
					break;
				case '8':
					moroseCode.append("---.. ");
					break;
				case '9':
					moroseCode.append("----. ");
					break;
				case '0':
					moroseCode.append("----- ");
					break;
				case ' ':
					moroseCode.append("  ");
					break;
				default:
					break;
			}
		}
		
		System.out.printf("Your sentence in morose code:%n%s", moroseCode.toString());
		
		input.close();
	}

}
