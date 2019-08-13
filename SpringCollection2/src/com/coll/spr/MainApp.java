package com.coll.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
   ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
   
   Question quest=(Question)context.getBean(Question.class);
   quest.displayInfo();
	}

}
