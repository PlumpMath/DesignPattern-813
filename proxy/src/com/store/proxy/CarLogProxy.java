package com.store.proxy;

/**
 * @Package com.store.proxy
 * @ClassName: com.store.proxy.CarLogProxy  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午5:23:23
 * @Description:
 */
public class CarLogProxy implements Moveable {
	/**
	 * @param m
	 * Description:
	 */
	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}

	// 车的父接口。
	private Moveable m;
	
	/** 
	 * @author 张明明
	 * @date 2016年3月15日 下午5:23:24
	 * @Description:
	 */
	@Override
	public void move() {
		System.out.println("日志开始....");
		m.move();
		System.out.println("日志结束....");
	}

}
