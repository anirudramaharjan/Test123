package com.zorba.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("calling by Vodafone sim.");
		
	}

	@Override
	public void data() {
		System.out.println("using data by Vodafone sim.");
		
	}

}
