package com.spr.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AfterAdvisor implements AfterReturningAdvice {

	
	@Override
	public void afterReturning(Object returnvalue, Method method, Object[] arg2,
			Object object) throws Throwable {
	System.out.println("Method "+method+" returns "+returnvalue+" of class "+object);
		
	}

}
