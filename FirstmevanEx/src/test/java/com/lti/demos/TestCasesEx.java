package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.calculator;

class TestCasesEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testCases1()
	{
		Assertions.assertEquals("abc","abc");
	    Assertions.assertEquals(500,200+300);
	}
	@Test
	public void testAdd()
	{
		calculator c= new calculator();
		int r= c.add(300, 200);
		System.out.println(r);
	}
    
	@Disabled
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
    
	@Disabled
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	// assertFalse(al.isEmpty());
	}
	
	@Disabled
	@Test
	void testAssertNull() {
	String str1 = null;
	String str2 = "abc";
	Assertions.assertNull(str1);
	Assertions.assertNotNull(str2); 
	}

	
}
