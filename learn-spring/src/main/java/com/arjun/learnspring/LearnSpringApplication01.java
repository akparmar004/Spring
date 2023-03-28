package com.arjun.learnspring;


import com.arjun.learnspring.game.GameRunner;
import com.arjun.learnspring.game.MarioGame;
import com.arjun.learnspring.game.PacMan;
import com.arjun.learnspring.game.SuperContra;


public class LearnSpringApplication01 {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContra();
		var game = new PacMan();
		var gameRunner = new GameRunner(game);
		gameRunner.run(); 
	}

}
