package com.proliu.designPatterns.factory;

public class BookFactory extends AbstractFactory{

	@Override
	public Book getBook(String bookType) {
		if(bookType == null)
			return null ;
		
		if("math".equals(bookType))
			return new Math();
		else if("english".equals(bookType))
			return new English();
		
		return null;
	}

	@Override
	public Category getCategory(String categoryType) {
		return null;
	}

}
