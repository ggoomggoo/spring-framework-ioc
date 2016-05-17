package edu.biz.ioc;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderManager")
public class OrderManager {
	
//	@Resource
	
//	@Autowired
//	@Qualifier("daewoo")
	
	@Inject
	@Named("hyundai")
	
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
