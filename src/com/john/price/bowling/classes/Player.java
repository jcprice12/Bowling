package com.john.price.bowling.classes;

public class Player {
	
	private String name;
	private Line line;
	
	public Player() {}
	
	public Player(String name, Line line) {
		this.name = name;
		this.line = line;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Line getLine() {
		return this.line;
	}
	
	public void setScore(Line line) {
		this.line = line;
	}
}
