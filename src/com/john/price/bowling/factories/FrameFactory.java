package com.john.price.bowling.factories;

import java.util.ArrayList;

import com.john.price.bowling.classes.Frame;

public abstract class FrameFactory{
	public static Frame buildFrame(ArrayList<Integer> rolls) throws Exception {
		if(rolls.size() != 2) {
			throw new Exception();
		}
		return new Frame(rolls);
	}	
}
