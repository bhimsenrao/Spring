package com.mybean; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class Main { 

public static void main(String[] args) { 

    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); 
	//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); 

  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
  obj.getMessage();  
  context.registerShutdownHook(); 
  } 
}
