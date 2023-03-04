package com.taxi;

public class taxiClass {
	String car;
	int km;
	String locations;
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
	
		this.km = km;
	}
	public String getLocations() {
		return locations;
	}
	public void setLocations(String locations) {
		this.locations = locations;
	}
	
	
	public void printArray(String[] carbycity) {
	    if (carbycity.length == 0) {
	        System.out.println("Sorry, no cars available.");
	    } else {
	        for (int i = 0; i < carbycity.length; i++) {
	            System.out.print(carbycity[i] + " ");
	        }
	        System.out.println();
	    }
	}
	
	
	
	public int showrate( int [] kmrate,String []cars, String selectedCar) {
		  int index = 0;
		  for(int j=0; j<cars.length;j++) {
			  if (cars[j].equals(selectedCar));
			  index=j;
		  }
		 return index;
	  }
	
}