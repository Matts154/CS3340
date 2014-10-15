/**
 * Matt S
 * PC02 - Assignment 1
 * October 7, 2014
 */
package assignment;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		final int SIZE = 12;
		double[] rainfall = new double[SIZE];
		double sum = 0, avg = 0, highest = 0, lowest = 0;
		Scanner input = new Scanner(System.in);
		
		for( int i = 0; i < SIZE; i++ ) {
			System.out.printf("Enter amount for month %d: ", i + 1);
			rainfall[i] = input.nextDouble();
			
			while( rainfall[i] < 0 ) {
				System.out.printf("Error! Negative values not allowed.%nTry again: ");
				rainfall[i] = input.nextDouble();
			}
		}
		
		input.close();
		
		for( int i = 0; i < SIZE; i++ ) {
			sum += rainfall[i];
			
			if( rainfall[i] > highest )
				highest = rainfall[i];
			
			if( rainfall[i] < lowest || i == 0)
				lowest = rainfall[i];
		}
		
		avg = sum / SIZE;
		
		System.out.printf("Total rainfall: %f%n"
						+ "Average rainfall: %f%n"
						+ "Highest rainfall: %f%n"
						+ "Lowest rainfall: %f%n",
						sum, avg, highest, lowest);
	}

}
