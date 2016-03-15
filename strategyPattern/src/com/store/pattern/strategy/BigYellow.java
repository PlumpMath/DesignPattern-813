package com.store.pattern.strategy;

import com.store.pattern.Duck;
import com.store.pattern.strategy.impl.FlyNoWay;

/**
 * @Package com.store.pattern.strategy
 * @ClassName: com.store.pattern.strategy.BigYellow  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:15:34
 * @Description:大黄鸭的实现。
 */
public class BigYellow extends Duck {

	public BigYellow(){
		super();
		super.setFlyingStragety(new FlyNoWay());
	}
	
	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:15:34
	 * @Description:
	 */
	@Override
	public void display() {
		System.out.println("我是大黄鸭，身体很大，全身鹅黄");
	}

}
