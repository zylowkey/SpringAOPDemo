package com.yyc.a_proxy.b_cjlib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {

	public static UserServiceImpl createService() {
		//1.目标类
		final UserServiceImpl userService = new UserServiceImpl();
		//2.切面类
		final MyAspect myAspect = new MyAspect();
		//3.代理类
		//3.1核心类
		Enhancer enhancer = new Enhancer();
		//3.2确定父类
		enhancer.setSuperclass(userService.getClass());
		/*3.3设置回调函数，MethodInterceptor接口等效于InvocationHandler接口
		 *		 intercept（）等效于jdk  invoke()
		 *			参数123都一样
		 *			参数4：MethodProxy方法的代理
		 */
		enhancer.setCallback(new MethodInterceptor() {
			
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				
				//前方发
				myAspect.before();
				//执行目标类方法
				Object obj = method.invoke(userService, args);
				//执行代理类的父类，就是执行目标类
				methodProxy.invokeSuper(proxy, args);
				//后方法
				myAspect.after();
				return obj;
			}
		});
		//3.4创建代理
		UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
		return proxyService;
	}
}
