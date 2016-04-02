package com.proliu.designPatterns.single;

/**
 * @author duliu
 * 没有加锁，执行效率会提高, 类加载时就初始化，浪费内存。
 *
 */
public class SingleObject {

	private static SingleObject singleObject = new SingleObject();
	
	public SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		return singleObject;
	}
	
	public void outMsg(){
		System.out.println("Hello, This is Single Object." + this.getClass().hashCode());
	}
}
