package com.john.price.bowling.classes;

import java.util.ArrayList;

public class Line {
	public static final int FRAME_COUNT = 10;
	private ArrayList<Frame> frames;
	
	public Line() {
		frames = new ArrayList<Frame>();
	}
	
	public Line(ArrayList<Frame> frames) {
		this.setFrames(frames);
	}
	
	public void setFrames(ArrayList<Frame> frames) {
		this.frames = frames;
	}
	
	public ArrayList<Frame> getFrames() {
		return this.frames;
	}
	
	private boolean isLastFrame(int frameIndex) {
		return frameIndex == (FRAME_COUNT - 1) ? true : false;
	}
	
	private int getSpareScore(int frameIndex) {
		if(isLastFrame(frameIndex)) {		
			return this.frames.get(frameIndex).getThirdRoll();
		}	
		return this.frames.get(frameIndex + 1).getFirstRoll();
	}
	
	private int getStrikeScore(int frameIndex) {
		Frame frame;
		int total = 0;
		
		if(isLastFrame(frameIndex)) {
			frame = this.frames.get(frameIndex);
			return frame.getSecondRoll() + frame.getThirdRoll();
		}
		
		frameIndex += 1;
		frame = this.frames.get(frameIndex);
		total += frame.getBaseTotal();
		
		if(!frame.isStrike()) {
			return total;
		}
		
		if(isLastFrame(frameIndex)) {
			return total + frame.getSecondRoll();
		}
		
		frameIndex += 1;
		frame = this.frames.get(frameIndex);
		
		return total + frame.getFirstRoll();
	}
	
	
	public int getScore() {
		Frame frame;
		int score = 0;	
		for(int i = 0; i < this.frames.size(); i++) {
			frame = this.frames.get(i);
			score += frame.getBaseTotal();		
			if(frame.isSpare()) {
				score += getSpareScore(i);
			} else if(frame.isStrike()) {
				score += getStrikeScore(i);
			}
		}	
		return score;
	}
	
}
