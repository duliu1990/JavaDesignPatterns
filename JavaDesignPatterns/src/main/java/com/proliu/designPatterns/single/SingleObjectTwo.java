package com.proliu.designPatterns.single;

/**
 * @author duliu
 *这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized.
 */
public class SingleObjectTwo {

	private static SingleObjectTwo singleObjectTwo ;
	
	public SingleObjectTwo(){
		
	}
	
	public static SingleObjectTwo getInstance(){
		if(singleObjectTwo == null){
			singleObjectTwo = new SingleObjectTwo();
		}
		
		return singleObjectTwo;
	}
	
	public void outMsg(){
		System.out.println("Hello, This is Single Object Two." + this.getClass().hashCode());
	}
}
