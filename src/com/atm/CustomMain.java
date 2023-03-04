
package com.atm;

import java.util.Scanner;

public class CustomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cust[] = { "Aman", "Ram", "Sita", "Binod", "Raghav" };// based on value index identifying
		int[] pin = { 1111, 2222, 3333, 4444, 5555 }; // based on index identify value
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter you username");
		String inputName = scan.nextLine();

		Customer custom = new Customer();
		boolean status = custom.verifyUser(cust, inputName);

		if (status == true) {
			System.out.println("Please Enter you pin");
			int inputpin = scan.nextInt();

			boolean pincheck = custom.verifyPin(pin, inputpin, cust, inputName);

			if (pincheck == true) {
				System.out.println("Welcome to BOA");
			} else {
				System.out.println("Inavlid Credential");
			}
		}else {
			System.out.println("Username is not found");
		}
	}
}





