package com.spr.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvisorDemo implements ThrowsAdvice{
	public void afterThrowing(Exception ex){  
        System.out.println(ex+": Out of Stock");  
    }  
}
