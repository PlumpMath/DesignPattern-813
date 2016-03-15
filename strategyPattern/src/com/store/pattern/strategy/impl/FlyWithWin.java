package com.store.pattern.strategy.impl;

import com.store.pattern.strategy.FlyingStragety;

/**
 * @Package com.store.pattern.strategy.impl
 * @ClassName: com.store.pattern.strategy.impl.FlyWithWin  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:22:36
 * @Description:使用翅膀飞行的鸭子的实现。
 */
public class FlyWithWin implements FlyingStragety {

	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:22:36
	 * @Description:
	 */
	@Override
	public void performFiy() {
		System.out.println("振翅高飞！！！");
	}

}
