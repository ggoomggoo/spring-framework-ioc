package edu.biz.ioc;

import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	private String name;
	
	public Car() {
		
	}
	public Car(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
