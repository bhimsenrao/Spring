package com.coll.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spconfig.xml");
		Information info=(Information)context.getBean(Information.class);
		java.util.Map<String,String> map=info.getData();
		System.out.println(map);
		System.out.println(info.getMembers());
	}

}
