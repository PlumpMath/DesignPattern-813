package com.store.pattern;

/**
 * @Package com.store.pattern
 * @ClassName: com.store.pattern.SingletonLazy  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午5:19:06
 * @Description: 单例模式的懒汉式。
 * 既然是懒汉式就是等用的时候才创建对象。 
 * 1：由于要改对象只有1份因此私有化构造器;
 * 2：该对象的实例由自己创建;
 * 3：调用创建对象的方法是类的方法，而不是对象的方法，因此方法是static的。
 */
public class SingletonLazy {
	
	/**
	 * @author 张明明
	 * @date 2016年3月3日 下午5:23:08
	 * @Description: 私有化构造方法。
	 */
	private SingletonLazy(){}
	
	/**
	 * 单例模式创建的对象。
	 */
	private static SingletonLazy instance;
	
	/**
	 * @author 张明明
	 * @date 2016年3月3日 下午5:26:48
	 * @return SingletonLazy
	 * @Description:
	 */
	public static SingletonLazy getInstance(){
		if(null == instance){
			instance=new SingletonLazy();
		}
		return instance;
	}
	
}
