package com.store.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Package com.store.proxy.dynamic
 * @ClassName: com.store.proxy.dynamic.TimeHandler  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午5:37:00
 * @Description:
 */
public class TimeHandler implements InvocationHandler {

	/**
	 * @param target
	 * Description:
	 */
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}



	private Object target;
	
	
	
	/**
	 * @author 张明明
	 * @date 2016年3月15日 下午5:37:39
	 * @param proxy 被代理对象
	 * @param method 被代理对象的方法
	 * @param args 方法的参数
	 * @return
	 * @throws Throwable
	 * @Description:
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		long startTime=System.currentTimeMillis();
		System.out.println("汽车开始行驶了...");
		method.invoke(target);
		long endTime=System.currentTimeMillis();
		System.out.println("汽车结束行驶...");
		System.out.println("汽车行驶了"+(endTime-startTime)+"毫秒！！");
		return null;
	}

}
