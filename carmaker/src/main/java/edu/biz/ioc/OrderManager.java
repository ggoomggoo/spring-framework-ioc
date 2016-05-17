package edu.biz.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderManager")
public class OrderManager {
	@Autowired
	@Qualifier("daewoo")
//	private HyundaiMaker maker;
	private CarMaker maker;
	
	private String name;
	
	@Autowired
	private Money money;
	
	public OrderManager() {
//		this.maker = new HyundaiMaker();
//		this.maker = new DaewooMaker();
	}
	
	public void order() {
		Car car = this.maker.sell(new Money(1000));
	}
	
	public void setMaker(CarMaker maker) {
		this.maker = maker;
	}

}
