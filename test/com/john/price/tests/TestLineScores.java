package com.john.price.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.john.price.bowling.classes.Frame;
import com.john.price.bowling.classes.Line;

public class TestLineScores {

	@Test
	public void testAllGutters() {
		ArrayList<Frame> frames = new ArrayList<Frame>();
		for(int i = 0; i < Line.FRAME_COUNT; i++) {
			frames.add(new Frame());
		}
		Line line = new Line(frames);
		assertEquals(line.getScore(), 0);
	}
	
	@Test
	public void testAllThrees() {
		ArrayList<Frame> frames = new ArrayList<Frame>();
		for(int i = 0; i < Line.FRAME_COUNT; i++) {
			frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(3,3))));
		}
		Line line = new Line(frames);
		assertEquals(line.getScore(), 60);
	}
	
	@Test
	public void testAllSpares() {
		ArrayList<Frame> frames = new ArrayList<Frame>();
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
		assertEquals(line.getScore(), 150);
	}
}
