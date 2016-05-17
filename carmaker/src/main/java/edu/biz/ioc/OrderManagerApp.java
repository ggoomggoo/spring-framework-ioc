package edu.biz.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

@Service
public class OrderManagerApp {
	
	static OrderManager orderManager;
	
	@Autowired
	public OrderManagerApp(OrderManager orderManager) {
		OrderManagerApp.orderManager = orderManager;
	}
	
	public static void main(String[] args) {
		// BeanFactory
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/ioc.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:ioc4.xml");
		
		// .getBean()
//		OrderManager orderManager = (OrderManager) factory.getBean("orderManager");
		orderManager.order();
		
		System.out.println();
	}

}
