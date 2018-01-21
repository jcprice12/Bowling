package com.john.price.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.john.price.bowling.classes.Frame;

public class TestFrame {
	@Test
	public void testIsStrike() {
		Frame frame = new Frame(new ArrayList<>(Arrays.asList(10,0)));
		assertEquals(true, frame.isStrike());
	}
	
	@Test
	public void testIsSpare() {
		Frame frame = new Frame(new ArrayList<>(Arrays.asList(3,7)));
		assertEquals(true, frame.isSpare());
	}
	
	@Test
	public void testGetTotal() {
		Frame frame = new Frame(new ArrayList<>(Arrays.asList(3,5)));
		assertEquals(8, frame.getBaseTotal());
	}
}
