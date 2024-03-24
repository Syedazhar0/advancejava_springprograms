package com.sathya.springex.SpringExample2;

public class Car implements Vehicle {
	private String fuleType;
	private int maxspeed;
	
	public String getFuleType() {
		return fuleType;
	}

	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	@Override
	public void move() {
		System.out.println("you selected car vehicle");
		System.out.println("max speed ........."+maxspeed);
		System.out.println("fuletype is ..."+fuleType);
		
	}

}
