package com.spr.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvicer implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg1, Object obj)
			throws Throwable {
		System.out.println(" method "+method.getName()+" calling "+obj);
		
	}

}
