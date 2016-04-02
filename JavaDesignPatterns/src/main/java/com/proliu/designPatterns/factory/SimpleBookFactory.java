package com.proliu.designPatterns.factory;

public class SimpleBookFactory {

	public Book getBook(String bookType){
		
		if(bookType == null)
			return null ;
		
		if("math".equals(bookType))
			return new Math();
		else if("english".equals(bookType))
			return new English();
		
		return null ;
		
	}
}
