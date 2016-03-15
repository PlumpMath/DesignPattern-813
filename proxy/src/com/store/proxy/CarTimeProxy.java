package com.store.proxy;

/**
 * @Package com.store.proxy
 * @ClassName: com.store.proxy.CarTimeProxy  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 下午5:13:51
 * @Description: 记录汽车运行时间的代理类。
 */
public class CarTimeProxy implements Moveable {
	// 车的父接口。
	private Moveable m;

	/**
	 * @param m
	 * Description:在构造方法中注入接口对象。
	 */
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	
	/** 
	 * @author 张明明
	 * @date 2016年3月15日 下午5:13:51
	 * @Description:在车的运行中记录时间。
	 */
	@Override
	public void move() {
		long startTime=System.currentTimeMillis();
		System.out.println("汽车开始行驶了...");
		m.move();
		long endTime=System.currentTimeMillis();
		System.out.println("汽车结束行驶...");
		System.out.println("汽车行驶了"+(endTime-startTime)+"毫秒！！");
	}

}
