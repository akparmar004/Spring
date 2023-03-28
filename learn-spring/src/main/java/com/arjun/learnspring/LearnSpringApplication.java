package com.arjun.learnspring;


import com.arjun.learnspring.game.GameRunner;
import com.arjun.learnspring.game.MarioGame;
import com.arjun.learnspring.game.SuperContra;


public class LearnSpringApplication {

	public static void main(String[] args) {
		//var marioGame = new MarioGame();
		var superContra = new SuperContra();
		var gameRunner = new GameRunner(superContra);
		gameRunner.run(); 
	}

}
