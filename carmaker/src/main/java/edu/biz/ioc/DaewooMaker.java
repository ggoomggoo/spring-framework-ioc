package edu.biz.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("daewoo")
public class DaewooMaker implements CarMaker {
	
	@Autowired
	private Car car;

	@Override
	public Car sell(Money money) {
		System.out.println("i sold a car");
		Car car = new Car("Tosca");
		return car;
	}

}
