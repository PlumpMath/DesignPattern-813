package com.store.proxy.dynamic;

import org.junit.Test;

import com.store.proxy.dynamic.cglib.CglibProxy;
import com.store.proxy.dynamic.cglib.Train;

/**
 * @Package com.store.proxy.dynamic
 * @ClassName: com.store.proxy.dynamic.TestClent  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午6:02:26
 * @Description:
 */
public class TestClent {

	@Test
	public void test() {
		CglibProxy proxy=new CglibProxy();
		Train train=(Train)proxy.getProxy(Train.class);
		train.move();
	}

}
