package com.store.pattern.strategy;

import com.store.pattern.Duck;
import com.store.pattern.strategy.impl.FlyNoWay;

/**
 * @Package com.store.pattern.strategy
 * @ClassName: com.store.pattern.strategy.RubberDuck  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:34:29
 * @Description:橡胶鸭的实现
 */
public class RubberDuck extends Duck {

	public RubberDuck(){
		super();
		super.setFlyingStragety(new FlyNoWay());
	}
	
	
	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:34:29
	 * @Description:
	 */
	@Override
	public void display() {
		System.out.println("我是橡胶鸭，全身发黄，嘴巴很红。");
	}
	
	public void quack(){
		System.out.println("嘎...嘎...嘎...");
	}

}
