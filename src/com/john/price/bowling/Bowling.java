package com.john.price.bowling;

import java.util.ArrayList;
import java.util.Arrays;

import com.john.price.bowling.classes.Frame;
import com.john.price.bowling.classes.Line;

public class Bowling {

	public static void main(String[] args) {
		System.out.println("Run some tests!");
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
		frames.add(new Frame(new ArrayList<Integer>(Arrays.asList(0,10,0))));
		Line line = new Line(frames);
		line.getScore();
	}

}
