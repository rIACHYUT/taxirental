package com.atm;

public class Customer {
	private String name;
	private int pin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public boolean verifyUser(String[] cust, String userName) {
		boolean flag = true; // (we can write any word instead of flag,like check,status)
		for (String arrcust : cust) {
			if (arrcust.equals(userName)) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public boolean verifyPin(int[] pin, int pinNumber, String cust[], String name) {
		int index = 0;
		boolean flag = true;
		for (int i = 0; i < cust.length; i++) {// iterating array 
			if (cust[i].equals(name)) {// getting index of element
				index = i;
			}
		}
		int pinNum = pin[index]; // assigning pin to index
		if (pinNum == pinNumber) { // verifying PinNumber
			flag = true;

		} else {
			flag = false;
		}
		return flag;
	}
	

}

