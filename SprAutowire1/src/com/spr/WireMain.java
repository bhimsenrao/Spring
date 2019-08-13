package com.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WireMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spconfig.xml");
		Person p= (Person)context.getBean(Person.class);
		System.out.println(p.getPname());
		System.out.println(p.getAddr().getDoorno());
		System.out.println(p.getAddr().getStreet());
		System.out.println(p.getAddr().getArea());
	}

}
