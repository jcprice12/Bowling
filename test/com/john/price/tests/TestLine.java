package com.john.price.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.john.price.bowling.classes.Frame;
import com.john.price.bowling.classes.Line;

public class TestLine {

	@Test
	public void testAllGutters() {	
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		Line line = new Line(frames);
		assertEquals(0, line.getScore());		
	}
	
	@Test
	public void testAllThrees() {
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		Line line = new Line(frames);
		assertEquals(60, line.getScore());
	}
	
	@Test
	public void testAllSpares() {
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(5,5,5))));
		Line line = new Line(frames);
		assertEquals(150, line.getScore());
	}
	
	@Test
	public void testAllStrikes() {
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,10,10))));
		Line line = new Line(frames);
		assertEquals(300, line.getScore());
	}
	
	@Test
	public void testAllStrikesButGuttersInLastFrame() {
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,0))));
		Line line = new Line(frames);
		assertEquals(240, line.getScore());
	}
	
	@Test
	public void testAllStrikesButSpareInLastFrame() {
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,10,10))));
		Line line = new Line(frames);
		assertEquals(270, line.getScore());
	}
	
	@Test
	public void testNineOnSecondToLast() {
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,9,1))));
		Line line = new Line(frames);
		assertEquals(289, line.getScore());
	}
	
	@Test
	public void testMissedOpportunity() {
		ArrayList<Frame> frames = new ArrayList<>();
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,0))));
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(10,10,9))));
		Line line = new Line(frames);
		assertEquals(299, line.getScore());
	}
}
