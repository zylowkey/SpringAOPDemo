package com.yyc.b_factoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 * 切面类中确定通知，实现不同的接口，接口就是规范，从而确定方法名称
 * 	采用环绕通知 ：MethodInterceptor 必须手动执行目标方法
 */
public class MyAspect implements MethodInterceptor{

	public Object invoke(MethodInvocation mi) throws Throwable {
		
		System.out.println("前");
		
		// 必须手动执行目标方法
		Object object = mi.proceed();
		
		System.out.println("后");
		return object;
	}
}
