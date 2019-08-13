package com.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WireMain {

	public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("spconfig1.xml");
	Developer dev=(Developer)context.getBean("dev");
	System.out.println(dev.getDevName());
	System.out.println(dev.getTech().getTechname());
	System.out.println(dev.getTech().getExperience());
	}

}
