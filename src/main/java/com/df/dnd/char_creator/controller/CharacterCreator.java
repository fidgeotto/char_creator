package com.df.dnd.char_creator.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.df.dnd.char_creator.model.impl.Character;
import com.df.dnd.char_creator.model.DndComponent;
import com.df.dnd.char_creator.model.impl.*;

public class CharacterCreator {
	
	CharacterCalculator charCalculator = new CharacterCalculator();
	
	public Character createNewCharacter(){
		
		Character newCharacter = new Character();	
		
		return newCharacter;	
		
	}

	public List<DndComponent> getAvailableRaces() {
		//initialize dwarf
		DndRace dwarf = new DndRace("Dwarf");
		dwarf.updateAbilityScoreMod("con", 2);
		dwarf.updateAbilityScoreMod("cha", -2);
		
		//intialize human
		DndRace human = new DndRace("Human");
		
		//initialize elf
		DndRace elf = new DndRace("Elf");
		elf.updateAbilityScoreMod("dex", 2);
		elf.updateAbilityScoreMod("con", -2);
		
		//initialize gnome
		DndRace gnome = new DndRace("Gnome");
		gnome.updateAbilityScoreMod("con", 2);
		gnome.updateAbilityScoreMod("str", -2);
		
		//initialize half-elf
		DndRace halfElf = new DndRace("Half-elf");
		
		//initialize half-orc
		DndRace halfOrc = new DndRace("Half-orc");
		halfOrc.updateAbilityScoreMod("str", 2);
		halfOrc.updateAbilityScoreMod("int", -2);
		halfOrc.updateAbilityScoreMod("cha", -2);
		
		//initialize halfling
		DndRace halfling = new DndRace("Halfling");
		halfling.updateAbilityScoreMod("dex", 2);
		halfling.updateAbilityScoreMod("str", -2);
		
		//add all races to a list
		List<DndComponent> races = new ArrayList<DndComponent>();
		races.add(dwarf);
		races.add(human);
		races.add(elf);
		races.add(gnome);
		races.add(halfElf);
		races.add(halfOrc);
		races.add(halfling);
		
		return races;
		
	}

	public List<DndComponent> getAvailableClasses() {
		
		//intialize classes
		DndClass barbarian = new DndClass("Barbarian", 12, 1, 2, 0, 0, 4);
		DndClass bard = new DndClass("Bard", 6, 0, 0, 2, 2, 6);
		DndClass cleric = new DndClass("Cleric", 8, 0, 2, 0, 2, 2);
		DndClass druid = new DndClass("Druid", 8, 0, 2, 0, 2, 4);
		DndClass fighter = new DndClass("Fighter", 10, 1, 2, 0, 0, 2);
		DndClass monk = new DndClass("Monk", 8, 0, 2, 2, 2, 4);
		DndClass paladin = new DndClass("Paladin", 10, 1, 2, 0, 0, 2);
		DndClass ranger = new DndClass("Ranger", 8, 1, 2, 2, 0, 6);
		DndClass rogue = new DndClass("Rogue", 6, 0, 0, 2, 0, 8);
		DndClass sorcerer = new DndClass("Sorcerer", 4, 0, 0, 0, 2, 2);
		DndClass wizard = new DndClass("Wizard", 4, 0, 0, 0, 2, 2);
		
		//add all classes to a list
		List<DndComponent> classes = new ArrayList<DndComponent>();
		classes.add(barbarian);
		classes.add(bard);
		classes.add(cleric);
		classes.add(druid);
		classes.add(fighter);
		classes.add(monk);
		classes.add(paladin);
		classes.add(ranger);
		classes.add(rogue);
		classes.add(sorcerer);
		classes.add(wizard);
		
		return classes;
		
	}

	public int[] generateScores() {
		
//		Initialise scores array list 
		int[] abilityScores = new int[6];
		
//		generate 6 scores
		for (int i=0; i<6; i++) {
			abilityScores[i] = generateScore();
		}
		
		System.out.println(abilityScores);
		
		return abilityScores;
		
	}
	
	private int generateScore() {
		
		DiceRoller dSix = new DiceRoller();
		List<Integer> generatedNums = new ArrayList<Integer>(4);
		int score=0;
		
		for (int i=0; i<4; i++) {
			generatedNums.add(dSix.rollDice(6));
		}
		
		generatedNums.sort(null);
		generatedNums.remove(0);
		
		for (int j : generatedNums) {
			score += j;
		}
		
		return score;
	}
	
	public Character setCharacterAbilityScores(Character character, Map<String, Integer> assignedAbilityScores) {
		
		character.setAssignedAbilityScores(assignedAbilityScores);
		return character;
		
	}
	
	public Character setLevelOneHitPoints (Character character) {
		
		int hitDice = character.getCharClass().getHitDice();
		
		Map<String, Integer> abilityMods = charCalculator.calculateAbilityModifiers(character);
		
//		System.out.println("Calculating hit points");
//		System.out.println("Your class' hit dice is: " + hitDice);
//		System.out.println("Your constitution modifier is: " + abilityMods.get("con"));
		
		int totalHitpoints = hitDice + abilityMods.get("con");
		
//		System.out.println("The total is: " + totalHitpoints);
		
		character.setHitPoints(totalHitpoints);
		
		return character;
		
	}
	
	public int calculateLevelOneSkillPoints (Character character) {
		int availableSkillPoints = (character.getCharClass().getSkillNumber() +  charCalculator.calculateAbilityModifiers(character).get("int")) * 4;
		
		return availableSkillPoints;
	}
	
}
