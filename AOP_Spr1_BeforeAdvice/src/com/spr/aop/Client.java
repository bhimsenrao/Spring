package com.spr.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext  res= new ClassPathXmlApplicationContext("beans.xml");
	//BeanFactory factory=new XmlBeanFactory(res);
	Customer cst=(Customer)res.getBean("proxy");
	cst.purchase(4);
	cst.purchase(40);
	cst.purchase(20);		
}
}
