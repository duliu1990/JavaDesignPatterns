package com.proliu.designPatterns.test.single;

import org.junit.Test;

import com.proliu.designPatterns.single.SingleObject;
import com.proliu.designPatterns.single.SingleObjectFive;
import com.proliu.designPatterns.single.SingleObjectFour;
import com.proliu.designPatterns.single.SingleObjectSix;
import com.proliu.designPatterns.single.SingleObjectThree;
import com.proliu.designPatterns.single.SingleObjectTwo;

import junit.framework.TestCase;

/**
 * @author duliu
 *
 */
public class SingleObjectTest extends TestCase{

	@Test
	public void testSingleObejct(){
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.outMsg();
		
		SingleObject singleObject2 = SingleObject.getInstance();
		singleObject2.outMsg();
	}
	
	@Test
	public void testSingleObejctTwo(){
		SingleObjectTwo singleObject = SingleObjectTwo.getInstance();
		singleObject.outMsg();
		
		SingleObjectTwo singleObject2 = SingleObjectTwo.getInstance();
		singleObject2.outMsg();
	}
	
	@Test
	public void testSingleObejctThree(){
		SingleObjectThree singleObject = SingleObjectThree.getInstance();
		singleObject.outMsg();
		
		SingleObjectThree singleObject2 = SingleObjectThree.getInstance();
		singleObject2.outMsg();
	}
	
	@Test
	public void testSingleObejctFour(){
		SingleObjectFour singleObject = SingleObjectFour.getInstance();
		singleObject.outMsg();
		
		SingleObjectFour singleObject2 = SingleObjectFour.getInstance();
		singleObject2.outMsg();
	}
	
	@Test
	public void testSingleObejctFive(){
		SingleObjectFive singleObject = SingleObjectFive.getInstance();
		singleObject.outMsg();
		
		SingleObjectFive singleObject2 = SingleObjectFive.getInstance();
		singleObject2.outMsg();
	}
	
	@Test
	public void testSingleObejctSix(){
		SingleObjectSix singleObject = SingleObjectSix.INSTANCE;
		singleObject.outMsg();
		
		SingleObjectSix singleObject2 = SingleObjectSix.INSTANCE;
		singleObject2.outMsg();
	}
}
