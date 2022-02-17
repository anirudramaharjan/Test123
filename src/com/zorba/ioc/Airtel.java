package com.zorba.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println(" calling by Airtel sim. ");
		
	}

	@Override
	public void data() {
		System.out.println("using data by Airtel sim.");
		
	}

}
