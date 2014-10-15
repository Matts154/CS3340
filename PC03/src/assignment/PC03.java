/*
 * Matthew Stephenson
 * CS3340 - PC03
 * October 14, 2014
 */
package assignment;

import java.util.Scanner;

public class PC03 {

	public static void main(String[] args) {
		MyStack stack;
		Scanner input = new Scanner(System.in);
		int temp;

		do {
			System.out.print("Enter stack size: ");
			temp = input.nextInt();
		} while (temp <= 0);

		stack = new MyStack(temp);

		while (!stack.isFull()) {
			System.out.print("Enter an integer: ");
			stack.push(input.nextInt());
		}

		if (MyStack.getStaticCount() == 0)
			MyStack.setStaticCount(10);

		System.out.printf("Count: %d%n", MyStack.getStaticCount());
		System.out.printf("Stack contents: %s", stack.toString());

		input.close();
	}

}
