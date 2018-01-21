package com.john.price.bowling.classes;

import java.util.ArrayList;

public class Frame {
	
	private static final int MAX = 10;
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
	
	public void setRolls(ArrayList<Integer> rolls) {
		this.rolls = rolls;
	}
	
	public int getFirstRoll() {
		return this.rolls.get(0);
	}
	
	public int getSecondRoll() {
		return this.rolls.get(1);
	}
	
	public int getThirdRoll() {
		if(getRolls().size() == 3) {
			return getRolls().get(2);
		}
		return 0;
	}
	
	public boolean isStrike() {
		return getFirstRoll() == MAX ? true : false;
	}
	
	public boolean isSpare() {
		return !isStrike() && (getBaseTotal() == MAX) ? true : false; 
	}
	
	public int getBaseTotal() {
		int total = 0;
		total += getFirstRoll();
		if(!isStrike()) {
			total += getSecondRoll();
		}
		return total;
	}
}
