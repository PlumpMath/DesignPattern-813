package com.store.pattern;

import com.store.pattern.strategy.impl.FlyWithRocket;

/**
 * @Package com.store.pattern
 * @ClassName: com.store.pattern.SpaceDuck  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:42:42
 * @Description:太空鸭的实现。
 */
public class SpaceDuck extends Duck {

	public SpaceDuck(){
		super();
		super.setFlyingStragety(new FlyWithRocket());
	}
	
	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:43:16
	 * @Description:
	 */
	@Override
	public void display() {
		System.out.println("我头戴宇航头盔，手握太空枪。");
	}

}
