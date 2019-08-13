package com.spr.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
public static void main(String[] args) {
	Resource  res= new ClassPathResource("beans.xml");
	BeanFactory factory=new XmlBeanFactory(res);
	Customer cst=(Customer)factory.getBean("proxy");
	cst.purchase(4);
			
}
}
