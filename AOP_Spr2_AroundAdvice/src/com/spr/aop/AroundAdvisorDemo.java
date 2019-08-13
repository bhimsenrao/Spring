package com.spr.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisorDemo implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {

		Object obj = null;
		System.out.println("Before purchase "+Customer.product);
		obj = mi.proceed();
		System.out.println("After purchase "+Customer.product);
		return obj;
	}

}
