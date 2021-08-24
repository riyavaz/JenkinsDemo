package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCase {

	@Test
	public void testAdd()
	{
		int addition=Calculate.add(45, 0);
		assertEquals(45,addition);
		
	}
	@Test
	public void testSub()
	{
		int subtraction=Calculate.sub(4, 5);
		assertEquals(-1,subtraction);
		
	}
}
