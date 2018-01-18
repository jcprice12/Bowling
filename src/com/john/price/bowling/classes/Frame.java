package com.john.price.bowling.classes;

import java.util.ArrayList;

public class Frame {
	
	private ArrayList<Integer> rolls;
	
	public Frame(ArrayList<Integer> rolls) {
		this.rolls = rolls;
	}
	
	public Frame() {
		this.rolls = new ArrayList<Integer>();
		this.rolls.add(0);
		this.rolls.add(0);
	}

	public ArrayList<Integer> getRolls() {
		return this.rolls;
	}
	
	public int getFirstRoll() {
		return this.rolls.get(0);
	}
	
	public int getSecondRoll() {
		return this.rolls.get(1);
	}
	
	public int getBaseTotal() {
		return getFirstRoll() + getSecondRoll();
	}
	
	public boolean isStrike() {
		return getFirstRoll() == 10 ? true : false;
	}
	
	public boolean isSpare() {
		return !isStrike() && (getBaseTotal() == 10) ? true : false; 
	}
}
