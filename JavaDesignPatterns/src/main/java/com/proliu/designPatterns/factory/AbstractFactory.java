package com.proliu.designPatterns.factory;

public abstract class AbstractFactory {

	public abstract Book getBook(String bookType);
	
	public abstract Category getCategory(String categoryType);
	
}
