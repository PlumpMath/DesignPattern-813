package com.store.pattern.strategy.impl;

import com.store.pattern.strategy.FlyingStragety;

/**
 * @Package com.store.pattern.strategy
 * @ClassName: com.store.pattern.strategy.FlyNoWay  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:18:23
 * @Description:没有翅膀鸭子飞行的实现。
 */
public class FlyNoWay implements FlyingStragety {

	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:18:23
	 * @Description:
	 */
	@Override
	public void performFiy() {
		System.out.println("我不会飞行！！！");
	}

}
