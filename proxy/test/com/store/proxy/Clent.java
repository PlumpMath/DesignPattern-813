package com.store.proxy;

import org.junit.Test;

/**
 * @Package com.store.proxy
 * @ClassName: com.store.proxy.Clent  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午5:26:52
 * @Description:
 */
public class Clent {

	@Test
	public void test(){
		Car car=new Car();
		CarLogProxy clp=new CarLogProxy(car);
		CarTimeProxy ctp=new CarTimeProxy(clp);
		ctp.move();
	}
	
	

}
