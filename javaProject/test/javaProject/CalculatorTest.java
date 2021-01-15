package javaProject;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator c; 
	
	@Before
	public void init() {
		c = new Calculator();	
	}
		

	@Test
	public void testAdd() {
		 assertEquals(6, c.add(3, 3));
	}
	
	
	@Test
	public void testMinus() {
		  assertEquals(0, c.minus(3, 3));
	}
	
	
	@Test
	public void testMulti() {
		  assertEquals(9, c.multi(3, 3));
	}

	@Test
	public void testDivide() {
		assertTrue(c.divide(4, 4)>0);
		assertFalse( c.divide(4, 0)>0 );
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void testdivisionByZero() {
	    int a = 1/ 0;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		
			ArrayList emptyList =new ArrayList();
			Object o = emptyList.get(0);
		
	}
	

}
