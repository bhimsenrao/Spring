package com.spr.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spr.hib.Person;
import com.spr.hib.PersonDAO;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spconfig.xml");
        PersonDAO dao=(PersonDAO)context.getBean(PersonDAO.class);
       // dao.addPerson(new Person(168, "Uday"));
       // System.out.println("Record added");
      dao.getAll().stream().forEach(p->System.out.println(p.getPname()+" "+p.getId()));
    // dao.addPerson(new Person(168, "Uday"));
     //System.out.println("Record added");
	  
	}

}
