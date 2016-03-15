package com.store.pattern;

import org.junit.Test;

import com.store.pattern.strategy.BigYellow;
import com.store.pattern.strategy.RedHeadDuck;
import com.store.pattern.strategy.RubberDuck;

/**
 * @Package com.store.pattern
 * @ClassName: com.store.pattern.TestDuck  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月15日 上午10:50:23
 * @Description:
 */
public class TestDuck {

	Duck duck=null;

	/**
	 * @author 张明明
	 * @date 2016年3月15日 上午10:51:52
	 * @Description:测试大黄鸭
	 */
	@Test
	public void testBigYellow(){
		duck=new BigYellow();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("*************************");
		System.out.println();
	}
	
	/**
	 * @author 张明明
	 * @date 2016年3月15日 上午10:54:27
	 * @Description:绿头鸭
	 */
	@Test
	public void testMallardDuck(){
		duck=new MallardDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("*************************");
		System.out.println();
	} 
	
	/**
	 * @author 张明明
	 * @date 2016年3月15日 上午10:54:27
	 * @Description:红头鸭
	 */
	@Test
	public void testRedheadDuck(){
		duck=new RedHeadDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("*************************");
		System.out.println();
	} 
	
	/**
	 * @author 张明明
	 * @date 2016年3月15日 上午10:54:27
	 * @Description:橡胶鸭
	 */
	@Test
	public void testRubberDuck(){
		duck=new RubberDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("*************************");
		System.out.println();
	} 
	
	
	/**
	 * @author 张明明
	 * @date 2016年3月15日 上午10:54:27
	 * @Description:太空鸭
	 */
	@Test
	public void testSpaceDuck(){
		duck=new SpaceDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("*************************");
		System.out.println();
	} 
	
	
}
