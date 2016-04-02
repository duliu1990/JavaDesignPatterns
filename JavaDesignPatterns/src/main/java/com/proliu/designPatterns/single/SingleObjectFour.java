package com.proliu.designPatterns.single;

/**
 * @author duliu
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class SingleObjectFour {

	/**
	 * 用volatile修饰的变量，线程在每次使用变量的时候，都会读取变量修改后的最的值
	 */
	private volatile static SingleObjectFour singleObjectFour ;
	
	public SingleObjectFour(){
		
	}
	
	public static SingleObjectFour getInstance(){
		if(singleObjectFour == null){
			synchronized (SingleObjectFour.class){
				if(singleObjectFour == null)
					singleObjectFour = new SingleObjectFour();
			}
		}
		
		return singleObjectFour ;
	}
	
	public void outMsg(){
		System.out.println("Hello, This is Single Object Four." + this.getClass().hashCode());
	}
}
