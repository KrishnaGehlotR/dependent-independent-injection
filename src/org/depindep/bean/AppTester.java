package org.depindep.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTester {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		
		PenBean penBean = container.getBean(PenBean.class);
		penBean.write();
	}
}
