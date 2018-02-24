package com.yyc.e_aspect.a_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 切面类，含有多个通知
 */
public class MyAspect{

	public void myBefore(JoinPoint joinPoint){
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	
	public void myAfterReturning(JoinPoint joinPoint,Object s){
		System.out.println("后置通知"+joinPoint.getSignature().getName()+",s"+s);
	}
	//环绕
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("前");
		//手动执行目标方法
		Object object = joinPoint.proceed();
		System.out.println("后");
		return object;
		
	}
}
