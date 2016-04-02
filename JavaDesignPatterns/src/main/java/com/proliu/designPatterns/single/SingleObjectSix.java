package com.proliu.designPatterns.single;

/**
 * @author duliu
 * 参与枚举模式
 */
public enum SingleObjectSix {

	INSTANCE;  
	
	public void outMsg(){
		System.out.println("Hello, This is Single Object Six." + this.getClass().hashCode());
	}
}
