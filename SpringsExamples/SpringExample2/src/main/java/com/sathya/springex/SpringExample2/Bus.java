package com.sathya.springex.SpringExample2;

public class Bus implements Vehicle {
private String busType;
private int maxspeed;

	public String getBusType() {
	return busType;
}

public void setBusType(String busType) {
	this.busType = busType;
}

public int getMaxspeed() {
	return maxspeed;
}

public void setMaxspeed(int maxspeed) {
	this.maxspeed = maxspeed;
}

	@Override
	public void move() {
		System.out.println("your selected vehicle is bus");
		System.out.println("bus type ....."+busType);
		System.out.println("maxspeed....."+maxspeed);
		
	}

}
