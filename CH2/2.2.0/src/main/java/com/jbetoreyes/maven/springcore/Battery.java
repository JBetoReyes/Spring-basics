package com.jbetoreyes.maven.springcore;

public class Battery extends Product {
	
	private boolean rechargeable;
	
	public Battery(){
		super();
	}

	public Battery(String name, String price) {
		super(name, price);
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}
	
}
