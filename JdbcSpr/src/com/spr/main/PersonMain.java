package com.spr.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spr.jdbc.Person;
import com.spr.jdbc.PersonDAOImpl;

public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		PersonDAOImpl dao =(PersonDAOImpl)context.getBean("personBean");
		// adding record
		//dao.create(167, "Janardhan");
		java.util.List<Person> list=dao.getPersons();
		 
		for(Person p: list) {
			System.out.println(p.getId()+"   "+p.getPname());
			
		}
		
//		dao.delete(1);
	}

}
