package com.proliu.designPatterns.single;

/**
 * 
 * @author duliu
 * 第一次调用才初始化，避免内存浪费, 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 *
 */
public class SingleObjectThree {

	private static SingleObjectThree singleObjectThree ;
	
	public SingleObjectThree(){
		
	}
	
	/**
	 * 同步块大家都比较熟悉，通过 synchronized 关键字来实现，所有加上synchronized 和 块语句，
	 * 在多线程访问的时候，同一时刻只能有一个线程能够用synchronized 修饰的方法 或者 代码块。
	 * @return
	 */
	public static synchronized SingleObjectThree getInstance(){
		if(singleObjectThree == null){
			singleObjectThree = new SingleObjectThree();
		}
		
		return singleObjectThree;
	}
	
	public void outMsg(){
		System.out.println("Hello, This is Single Object Three." + this.getClass().hashCode());
	}
}
