package com.store.pattern;

import com.store.pattern.strategy.FlyingStragety;


/**
 * @Package com.store.pattern
 * @ClassName: com.store.pattern.Duck  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午9:56:43
 * @Description:基类，所有鸭子都要集成此类，抽象了鸭子的行为：鸭子的外观和名叫
 */
public abstract class Duck {

	/**
	 * @author 张明明
	 * @date 2016年3月15日 上午9:59:56
	 * @Description:鸭子发出的叫声，通用行为，由超类实现。
	 */
	public void quack(){
		System.out.println("嘎嘎嘎");
	}
	
	/**
	 * @author 张明明
	 * @date 2016年3月15日 上午10:00:57
	 * @Description:鸭子的外观，由子类实现。
	 */
	public abstract void display();
	
	private FlyingStragety flyingStragety;

	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}
	
	public void fly(){
		flyingStragety.performFiy();
	}
	
	
}
