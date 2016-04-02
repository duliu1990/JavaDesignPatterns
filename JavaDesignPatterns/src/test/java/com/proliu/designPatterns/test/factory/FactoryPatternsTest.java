package com.proliu.designPatterns.test.factory;

import org.junit.Test;

import com.proliu.designPatterns.factory.AbstractFactory;
import com.proliu.designPatterns.factory.Book;
import com.proliu.designPatterns.factory.Category;
import com.proliu.designPatterns.factory.FactoryProducer;
import com.proliu.designPatterns.factory.SimpleBookFactory;

import junit.framework.TestCase;

/**
 * @author duliu
 *
 */
public class FactoryPatternsTest extends TestCase{

	@Test
	public void testSimpleFactory(){
		SimpleBookFactory simpleBookFactory = new SimpleBookFactory();
		Book math = simpleBookFactory.getBook("math");
		math.bookDetails();
		
		Book english = simpleBookFactory.getBook("english");
		english.bookDetails();
	}
	
	@Test
	public void testAbstractFactory(){
		AbstractFactory bookFactory = FactoryProducer.getFactory("book");
		
		Book math = bookFactory.getBook("math");
		
		math.bookDetails();
		
		AbstractFactory categoryFactory = FactoryProducer.getFactory("category");
		
		Category edu = categoryFactory.getCategory("edu");
		
		edu.categoryDetails();
	}
}
