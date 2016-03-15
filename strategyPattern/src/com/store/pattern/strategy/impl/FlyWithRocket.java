package com.store.pattern.strategy.impl;

import com.store.pattern.strategy.FlyingStragety;

/**
 * @Package com.store.pattern.strategy
 * @ClassName: com.store.pattern.strategy.FlyWithRocket  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:24:27
 * @Description:太空鸭飞行的实现。
 */
public class FlyWithRocket implements FlyingStragety {

	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:24:27
	 * @Description:
	 */
	@Override
	public void performFiy() {
		System.out.println("用火箭在太空遨游！！！，很爽的。");
	}

}
