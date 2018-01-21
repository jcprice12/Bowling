package com.john.price.bowling.factories;

import java.util.ArrayList;

import com.john.price.bowling.classes.Line;
import com.john.price.bowling.factories.FrameFactory;

public abstract class LineFactory {
	public static Line build(ArrayList<ArrayList<Integer>> bowlingLine) throws Exception {
		Line line = new Line();
		for(int i = 0; i < bowlingLine.size(); i++) {
			line.getFrames().add(FrameFactory.buildFrame(bowlingLine.get(i)));
		}
		return line;
	}
}
