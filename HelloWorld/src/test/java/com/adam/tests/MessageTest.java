package com.adam.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adam.message.HelloMessage;

public class MessageTest {

	@Test
	public void test() {
		
		String actual = HelloMessage.createMessage();
		String expected = "Hello World!";
		
		assertEquals(expected, actual);
	}

}
