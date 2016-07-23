package com.df.dnd.char_creator.model.impl;

import java.util.Random;

public class DiceRoller {

	public int rollDice(int numberOfSides) {
		
		Random diceToRoll = new Random();
		int diceRoll = diceToRoll.nextInt(numberOfSides)+1;
		
		return diceRoll;
		
	}
	
}
