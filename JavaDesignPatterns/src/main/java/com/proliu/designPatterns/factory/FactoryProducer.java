package com.proliu.designPatterns.factory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType){
		if("book".equals(factoryType))
			return new BookFactory() ;
		else if("category".equals(factoryType))
			return new CategoryFactory() ;
		
		return null ;
	}
}
