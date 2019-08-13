package com.aop.xml;

import org.aspectj.lang.JoinPoint;

public class AopImpl {
	public void myadvice(JoinPoint jp)//it is advice  
    {  
        System.out.println("Current Balance: "+Depositor.depAmount);  
        System.out.println("Method Signature: "  + jp.getSignature());  
    }  

}
