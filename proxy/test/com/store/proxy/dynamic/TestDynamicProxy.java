package com.store.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.store.proxy.Car;
import com.store.proxy.Moveable;

/**
 * @Package com.store.proxy.dynamic
 * @ClassName: com.store.proxy.dynamic.TestDynamicProxy  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午5:44:07
 * @Description:
 */
public class TestDynamicProxy {

	@Test
	public void test(){
		Car car=new Car();
		InvocationHandler h=new TimeHandler(car);
		Class<?> cla=car.getClass();
		Moveable m=(Moveable)Proxy.newProxyInstance(cla.getClassLoader(),cla.getInterfaces(), h);
		m.move();
	}

}
