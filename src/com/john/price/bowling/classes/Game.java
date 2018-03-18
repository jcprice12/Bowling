package com.john.price.bowling.classes;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private List<Player> players;
	
	public Game() {}
	
	public Game(List<Player> players) {
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayerScores(List<Player> players) {
		this.players = players;
	}
	
	public List<String> getTopScorers() {
		int playerScore;
		int topScore = 0;
		List<String> topScorers = new ArrayList<String>();
		
		for(Player player : players) {
			playerScore = player.getLine().getScore();
			if(playerScore == topScore) {
				topScorers.add(player.getName());
			} else if(playerScore > topScore) {
				topScorers = new ArrayList<String>();
				topScorers.add(player.getName());
			}
		}
		
		return topScorers;
	}
}
