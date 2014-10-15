/*
 * Assignment: PC01
 * Matthew Stephenson
 * October 1st, 2014
 * 
 */

package PC01;

import java.util.Scanner;

public class PC01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double input1, input2, input3, sum, product, average;
		
		System.out.print("First number: ");
		input1 = input.nextDouble();
		
		System.out.print("Second number: ");
		input2 = input.nextDouble();
		
		System.out.print("Third number: ");
		input3 = input.nextDouble();

		sum = input1 + input2 + input3;
		product = input1 * input2 * input3;
		average = sum/3;
		
		System.out.println("User input: " + input1 + ", " + input2 + ", " + input3);
		System.out.println("Sum: " + sum + "\nProduct: " + product + "\nAverage: " + average);
		
		input.close();
	}

}
