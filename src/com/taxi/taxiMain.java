package com.taxi;

import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class taxiMain {

	public static void main(String[] args) {
		System.out.println("hello there");
		System.out.println("thanks for using our service");
		System.out.println("we are currently providing service in newyork city,"
				+ "philadelphia,harrisburg,chambersburg,hagerstown ");

		Scanner sc = new Scanner(System.in);

		String[] locations = { "nyc", "phili", "harrisburg", "chambersburg", "hagerstown" };
		String[] cars = { "Baleno", "jeep", "Alto", "innova" };
		int[] kmRate = { 12, 15, 11, 17 };

		String[] carinnyc = { cars[1], cars[2] };
		String[] carinphili = { cars[3] };
		String[] carinharrisburg = { cars[0] };
		String[] carinchambersburg = {};
		String[] carinhagerstown = {};

		System.out.print("Enter pick-up date (yyyy-mm-dd): ");
		String pickupdateString = sc.next();
		LocalDate pickupDate = LocalDate.parse(pickupdateString);

		System.out.print("Enter drop-off date (yyyy-mm-dd): ");
		String dropoffdateString = sc.next();
		LocalDate dropoffDate = LocalDate.parse(dropoffdateString);

		long numofdays = ChronoUnit.DAYS.between(pickupDate, dropoffDate);

		System.out.println("please eneter the pick up city");
		String pickup = sc.next();
		taxiClass tc = new taxiClass();

		System.out.println("please eneter the drop off city");
		String dropoff = sc.next();
		{
			if (dropoff.equals(pickup)) {

				System.out.println("please select different location");
			} else {

				if (pickup.equalsIgnoreCase("nyc")) {
					System.out.println("please select the car from the list");
					tc.printArray(carinnyc);
					String selectedcar = sc.next();
					System.out.println("total fair" + " "
							+ (numofdays * (250 * kmRate[tc.showrate(kmRate, cars, selectedcar)])) * 0.05);
				}
				if (pickup.equalsIgnoreCase("phili")) {
					System.out.println("please select the car from the list");
					tc.printArray(carinphili);
					String selectedcar = sc.next();
					System.out.println(
							"total fair" + " " + (250 * kmRate[tc.showrate(kmRate, cars, selectedcar)]) * 0.05);
				}
				if (pickup.equalsIgnoreCase("harrisburg")) {
					System.out.println("please select the car from the list");
					tc.printArray(carinharrisburg);
					String selectedcar = sc.next();
					System.out.println(
							"total fair" + " " + (250 * kmRate[tc.showrate(kmRate, cars, selectedcar)]) * 0.05);
				}
				if (pickup.equalsIgnoreCase("hagerstown")) {
					System.out.println("please select the car from the list");
					tc.printArray(carinhagerstown);
					String selectedcar = sc.next();
					System.out.println(
							"total fair" + " " + (250 * kmRate[tc.showrate(kmRate, cars, selectedcar)]) * 0.05);
				}
				if (pickup.equalsIgnoreCase("chambersburg")) {
					System.out.println("please select the car from the list");
					tc.printArray(carinchambersburg);
					String selectedcar = sc.next();
					System.out.println(
							"total fair" + " " + (250 * kmRate[tc.showrate(kmRate, cars, selectedcar)]) * 0.05);
				}

			}
		}
	}
}




