package assignment;

import java.util.Scanner;

public class PC0901 {

	public static void main(String[] args) {
		String name, hireDate;
		int num, shift;
		double payRate;
		
		ProductionWorker worker;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter worker's name: ");
		name = input.nextLine();
		
		System.out.print("Enter worker's number: ");
		num = input.nextInt();
		
		System.out.print("Enter worker's hire date: ");
		hireDate = input.next();
		
		System.out.print("Enter worker's shift: ");
		shift = input.nextInt();
		
		System.out.print("Enter worker's pay: ");
		payRate = input.nextDouble();
		
		input.close();
		
		worker = new ProductionWorker(name, num, hireDate, shift, payRate);
		
		// TODO: Learn proper formatting.
		System.out.printf("WORKER INFO:%nName\t\t\tNumber\tHireDate\tShift\t\tPayRate%n");
		System.out.printf("%s\t%d\t%s\t\t%d\t\t%f%n", worker.getName(), worker.getNumber(), worker.getHireDate(), worker.getShift(), worker.getPayRate());
		
	}

}
