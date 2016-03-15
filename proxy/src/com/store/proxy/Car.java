package com.store.proxy;

import java.util.Random;

/**
 * @Package com.store.proxy
 * @ClassName: com.store.proxy.Car  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午5:12:08
 * @Description:
 */
public class Car implements Moveable {

	/** 
	 * @author 张明明
	 * @date 2016年3月15日 下午5:12:08
	 * @Description: 小汽车的运行实现。
	 */
	@Override
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("一脚油门，车就走了...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
