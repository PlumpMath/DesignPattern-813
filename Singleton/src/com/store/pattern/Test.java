package com.store.pattern;

/**
 * @Package com.store.pattern
 * @ClassName: com.store.pattern.Test  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午5:31:45
 * @Description:
 */
public class Test {

	public static void main(String[] args) {
//		懒汉式
		SingletonHungry s1=SingletonHungry.getInstance();
		SingletonHungry s2=SingletonHungry.getInstance();
		if(s1==s2){
			System.out.println("s1和s2是同一个实例");
		}else{
			System.out.println("s1和s2不是同一个实例");
		}
//		饿汉式
		SingletonLazy s3=SingletonLazy.getInstance();
		SingletonLazy s4=SingletonLazy.getInstance();
		if(s3==s4){
			System.out.println("s3和s4是同一个实例");
		}else{
			System.out.println("S3和s4不是同一个实例");
		}
	}
}
