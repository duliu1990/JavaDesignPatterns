package com.proliu.designPatterns.factory;

public class CategoryFactory extends AbstractFactory{

	@Override
	public Book getBook(String bookType) {
		return null;
	}

	@Override
	public Category getCategory(String categoryType) {
		if(categoryType == null)
			return null ;
		
		if("edu".equals(categoryType))
			return new Education();
		else if("life".equals(categoryType))
			return new Life();
		
		return null;
	}

}
