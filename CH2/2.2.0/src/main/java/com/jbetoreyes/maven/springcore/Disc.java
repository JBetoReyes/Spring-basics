package com.jbetoreyes.maven.springcore;

public class Disc extends Product {
	
	private int capacity;
	
	public Disc(){
		super();
	}

	public Disc(String name, String price) {
		super(name, price);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
