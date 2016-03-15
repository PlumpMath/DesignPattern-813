package com.store.pattern;

import com.store.pattern.strategy.impl.FlyWithWin;

/**
 * @Package com.store.pattern
 * @ClassName: com.store.pattern.MallardDuck  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:47:56
 * @Description:绿头鸭的实现
 */
public class MallardDuck extends Duck {
	
	public MallardDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}

	/** 
	 * @author 张明明
	 * @date 2016年3月15日 上午10:47:56
	 * @Description:
	 */
	@Override
	public void display() {
		System.out.println("我是绿头鸭，头和脖子都是绿色的。");
	}

}
