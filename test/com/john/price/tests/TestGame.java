package com.john.price.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.john.price.bowling.classes.Frame;
import com.john.price.bowling.classes.Game;
import com.john.price.bowling.classes.Line;
import com.john.price.bowling.classes.Player;

public class TestGame {
	
	@Test
	public void testOneWinner() {
		List<Player> players = new ArrayList<Player>();
		
		ArrayList<Frame> frames = new ArrayList<>();
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
		
		Player player1 = new Player("John", line);
		
		players.add(player1);
		
		Game game = new Game(players);
		
		assertEquals(game.getTopScorers().size(), 1);
		assertEquals(game.getTopScorers().get(0), "John");
	}
}
