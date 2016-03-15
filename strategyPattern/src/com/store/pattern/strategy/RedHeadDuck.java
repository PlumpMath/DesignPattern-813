package com.store.pattern.strategy;

import com.store.pattern.Duck;
import com.store.pattern.strategy.impl.FlyWithWin;

/**
 * @Package com.store.pattern.strategy
 * @ClassName: com.store.pattern.strategy.RedHeadDuck  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:29:14
 * @Description:红头鸭的实现。
 */
public class RedHeadDuck extends Duck {

	/**
	 * Description:构造方法中设置飞行的方式。
	 */
	public RedHeadDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:29:14
	 * @Description:
	 */
	@Override
	public void display() {
		System.out.println("我的头是红色的。");
	}

}
