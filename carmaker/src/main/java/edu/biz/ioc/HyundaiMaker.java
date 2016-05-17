package edu.biz.ioc;

public class HyundaiMaker {
	
	public HyundaiMaker() {
		
	}
	
	public Car sell(Money money) {
		System.out.println("i sold a car");
		Car car = new Car("morning");
		return car;
	}

}
