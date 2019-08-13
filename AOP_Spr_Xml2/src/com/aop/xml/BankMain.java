package com.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");  
        Depositor e = (Depositor) context.getBean("opBean"); 
        System.out.println("After Deposit:"+e.deposit(5000));
        System.out.println("After Withdraw:"+e.withdraw(8000));
	}

}
