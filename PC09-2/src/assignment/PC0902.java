package assignment;

import java.util.Scanner;

public class PC0902 {

	public static void main(String[] args) {
		String name, hireDate;
		int num;
		double salary, bonus;
		
		ShiftSupervisor supervisor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter worker's name: ");
		name = input.nextLine();
		
		System.out.print("Enter worker's number: ");
		num = input.nextInt();
		
		System.out.print("Enter worker's hire date: ");
		hireDate = input.next();
		
		System.out.print("Enter worker's salary: $");
		salary = input.nextDouble();
		
		System.out.print("Enter worker's bonus: $");
		bonus = input.nextDouble();
		
		input.close();
		
		supervisor = new ShiftSupervisor(name, num, hireDate, salary, bonus);
		
		// TODO Learn proper formatting.
		System.out.printf("WORKER INFO:%nName\t\t\tNumber\tHireDate   Salary\tBonus%n");
		System.out.printf("%-23s %-7d %-10s $%-11.2f $%.2f %n", supervisor.getName(), supervisor.getNumber(), supervisor.getHireDate(), supervisor.getSalary(), supervisor.getBonus());

	}

}
