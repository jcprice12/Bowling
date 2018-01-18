package com.john.price.bowling.classes;

import java.util.ArrayList;
import java.util.List;

public class Line {
	public static final int FRAME_COUNT = 10;
	private List<Frame> line;
	
	public Line(ArrayList<Frame> line) {
		this.setLine(line);
	}
	
	public  Line() {
		this.setLine(new ArrayList<Frame>());
	}
	
	private int getSpareScore(int nextFrameIndex) {
		if(nextFrameIndex < FRAME_COUNT) {
			return line.get(nextFrameIndex).getFirstRoll();
		}
		return line.get(FRAME_COUNT - 1).getRolls().get(2);
	}

	public void setLine(List<Frame> line) {
		this.line = line;
	}
	
	public int getScore() {
		int score = 0;
		Frame frame;
		for(int i = 0; i < this.line.size(); i++) {
			frame = this.line.get(i);
			score += frame.getBaseTotal();
			if(frame.isSpare()) {
				score += getSpareScore(i+1);
			}
		}
		return score;
	}
	
}
