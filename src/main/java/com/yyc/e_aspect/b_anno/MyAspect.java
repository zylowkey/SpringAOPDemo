package com.yyc.e_aspect.b_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*
 * 切面类，含有多个通知
 */
@Component
@Aspect
public class MyAspect{

	//切入点当前有效
	@Before("execution(* com.yyc.e_aspect.b_anno.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint){
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	//声明公共的切入点
	@Pointcut("execution(* com.yyc.e_aspect.b_anno.UserServiceImpl.*(..))")
	private void myPointCut(){
		
	}
	
	@AfterReturning(value="myPointCut()",returning="s")
	public void myAfterReturning(JoinPoint joinPoint,Object s){
		System.out.println("后置通知"+joinPoint.getSignature().getName()+",s"+s);
	}
	//环绕
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("前");
		//手动执行目标方法
		Object object = joinPoint.proceed();
		System.out.println("后");
		return object;
		
	}
}
