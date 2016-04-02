package com.proliu.designPatterns.single;

/**
 * @author duliu
 * 通过静态内部类来实现类的实例化
 */
public class SingleObjectFive {

	private static class SingleObjectHolder{
		private static final SingleObjectFive INSTANCE = new SingleObjectFive();  
	}
	
	public SingleObjectFive(){
		
	}
	
	public static final SingleObjectFive getInstance(){
		return SingleObjectHolder.INSTANCE ;
	}
	
	public void outMsg(){
		System.out.println("Hello, This is Single Object Five." + this.getClass().hashCode());
	}
}
