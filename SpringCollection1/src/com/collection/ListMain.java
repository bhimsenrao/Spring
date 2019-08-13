package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMain {

	public static void main(String[] args) {
		  ApplicationContext context= 
				  new ClassPathXmlApplicationContext("spconfig1.xml");

	Question quest=(Question)context.getBean(Question.class);
	quest.displayInfo();
	}

}
