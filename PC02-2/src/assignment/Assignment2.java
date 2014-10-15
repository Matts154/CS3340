/**
 * Matthew Stephenson
 * PC02 - Assignment 2
 * October 7, 2014
 */
package assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		final int NUM_QUESTIONS = 20;
		int correct = 0, incorrect = 0;
		Scanner input = new Scanner(System.in);
		String testAnswers = "BABCDBCCAADBACADCDDA";
		String studentAnswers = "";
		
		for (int i = 1; i <= NUM_QUESTIONS; i++) {
			System.out.printf("Question #%d answer[ABCD]: ", i);
			String userInput = input.next();

			while (userInput.length() != 1 || (userInput.charAt(0) & 0x0000000F) > 4) {
				System.out.printf("Invalid input.%nTry again: ");
				userInput = input.next();
			}
			
			studentAnswers += userInput.toUpperCase();
		}

		input.close();
		
		System.out.println("Missed: ");
		
		for(int i = 0; i < NUM_QUESTIONS; i++) {
			if( testAnswers.charAt(i) != studentAnswers.charAt(i) ){
				System.out.printf(" %d ", i + 1);
				incorrect++;
			}
			else {
				correct++;
			}
		}
		
		if( incorrect == 0 )
			System.out.print("None!");
		
		System.out.printf("%nCorrect: %d, Incorrect %d%n", correct, incorrect);
		
		if (correct == NUM_QUESTIONS)
			System.out.println("Perfect score!");
		else if ( correct > Math.floor(NUM_QUESTIONS * 0.75 ) )
			System.out.println("Pass!");
		else
			System.out.println("Fail.");
		
	}
	
}
