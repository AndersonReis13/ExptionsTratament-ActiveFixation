package application;

import java.util.Locale;
import java.util.Scanner;

import model.entites.Account;
import model.exceptions.ExceptionsTratament;

public class Project {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
		System.out.println("Enter a dete account - ");
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Number: " );
		Integer number = sc.nextInt();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limite: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println("Enter amount for deposit?(y/n)");
		char letter = sc.next().charAt(0);

		if(letter == 'y') {
			System.out.print("Enter amount: ");
			Double amount = sc.nextDouble();
			acc.deposit(amount);
		}

		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		acc.withdraw(amount);
		
		sc.close();
		System.out.println("Data: " + acc);
		}catch(ExceptionsTratament e) {
			System.out.println(e.getMessage());
		}
	}
}
