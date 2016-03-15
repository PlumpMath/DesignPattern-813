package com.store.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @Package com.store.proxy.dynamic.cglib
 * @ClassName: com.store.proxy.dynamic.cglib.CglibProxy  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午5:55:39
 * @Description:
 */
public class CglibProxy implements MethodInterceptor{


	public Object getProxy(Class clazz){
		//设置创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
	}

	private Enhancer enhancer=new Enhancer();
	
	
	/**
	 * @author 张明明
	 * @date 2016年3月15日 下午5:59:51
	 * @param obj 目标类的实例
	 * @param method 目标方法的反射对象
	 * @param arg2 方法的参数
	 * @param proxy 代理类的实例
	 * @throws Throwable
	 * @Description: 拦截所有目标类方法的调用
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] arg2,MethodProxy proxy) throws Throwable {
		System.out.println("日志开始...");
		//代理类调用父类的方法
		proxy.invokeSuper(obj, arg2);
		System.out.println("日志结束...");
		return null;
	}

}
