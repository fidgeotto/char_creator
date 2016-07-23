package com.df.dnd.char_creator.views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import com.df.dnd.char_creator.controller.CharacterCalculator;
import com.df.dnd.char_creator.controller.CharacterCreator;
import com.df.dnd.char_creator.model.impl.Character;
import com.df.dnd.char_creator.model.DndComponent;
import com.df.dnd.char_creator.model.impl.*;

public class CommandLineView {

CharacterCreator characterCreator = new CharacterCreator(); 
CharacterCalculator characterCalculator = new CharacterCalculator();
Helper helper = new Helper();

	public void createCharacterPrompt(){
		
		System.out.println("Would you like to create a new character (y/n)");
		
		String response = getInput().toLowerCase();
		
		if (response.matches("y")) {
			
			//TODO Add in the option to input real-life rolls
			//rolls 6 ability scores using standard rules (4d6, drop lowest)
			int[] rolledScores = characterCreator.generateScores();
			
			System.out.println("You rolled these scores:");
			displayArray(rolledScores);
			
			Character newCharacter = characterCreator.createNewCharacter();
			
			//pick a class
			newCharacter = pickAClass(newCharacter);
			
			System.out.println("Your character class is now " + newCharacter.getCharClass().getName());
			
			//pick a race
			newCharacter = pickARace(newCharacter);
			
			System.out.println("Your character race is now " + newCharacter.getCharRace().getName());
			
			System.out.println("This race gives you these base ability scores: ");
			
			//displays racial ability modifiers for context before assigning
			displayHashMap(newCharacter.getCharRace().getAbilityScoreMods());
			
			//assign the rolled scores to the character scores map
			Map<String, Integer> assignedAbilityScores = assignRolledScores(rolledScores);
			
			newCharacter = characterCreator.setCharacterAbilityScores(newCharacter, assignedAbilityScores);
			
			System.out.println("Overall Ability Scores: " + characterCalculator.calculateOverallAbilityScores(newCharacter));
			System.out.println("Ability Modifiers: " + characterCalculator.calculateAbilityModifiers(newCharacter));
			
			newCharacter = characterCreator.setLevelOneHitPoints(newCharacter);
			
			System.out.println("This character's hit points are: " + newCharacter.getHitPoints());
			
			System.out.println("This character has " + characterCreator.calculateLevelOneSkillPoints(newCharacter) + " skill points to spend");
			
		} else if (! response.matches("n")) {
			
			System.out.println(response + " is not a valid input");
			
			createCharacterPrompt();
		}
		
	}
	
	private Map<String, Integer> assignRolledScores(int[] rolledScores) {
		
		String response = new String();
		Map<String, Integer> assignedAbilityScores = helper.getAbilityMap();
		
		
		for (String ability : assignedAbilityScores.keySet()) {
			System.out.println("Please choose a score for the ability " + ability);
			System.out.println("Your choices are: ");
			displayArray(rolledScores);
			boolean responseNotValid = true;
			
			while (responseNotValid) {
				response = getInput();
				if (response != "") {
					try {
						int num = Integer.parseInt(response);
						assignedAbilityScores.replace(ability, rolledScores[num]);
						rolledScores = removeElementFromArr(rolledScores, num);
						responseNotValid = false;
					} catch (Exception e) {
						responseNotValid = true;
						System.out.println(response + " is not a valid response. Please input a number 0 to " + rolledScores.length);
					}
				}
			}
		}
		
		return assignedAbilityScores;
	}
	
	private int[] removeElementFromArr(int[] rolledScores, int num) {
		
		int[] newArray = new int[rolledScores.length - 1];
		int j=0;
		
		for (int i = 0; i<rolledScores.length; i++) {
			if ( i != num ) {
			    newArray[j] = rolledScores[i];
			    j++;
			}
		}
		return newArray;
	}

	private void displayHashMap(Map<String, Integer> inputMap) {
		
		for (Object key : inputMap.keySet()) {
			System.out.println(key + ": " + inputMap.get(key));
		}
		
	}

	private void displayArray (int[] rolledScores) {
		
		for (int i=0 ; i < rolledScores.length; i++) {
			System.out.println(i + ". " + rolledScores[i]);
		}
		
	}
	
	private Character pickARace (Character character) {
		
		List<DndComponent> races = characterCreator.getAvailableRaces();
		
		DndRace raceToAdd;
		
		if (character.getCharRace() == null ) {
			System.out.println("Please pick a race for your character. The options are :");
		} else {
			System.out.println("Please pick a new race for your character."); 
			System.out.println("You current race is " + character.getCharRace().getName());
			System.out.println("Your options are: ");
		}
		
		displayComponents(races);
		
		String response = getInput();
		
		if (response != "") {
			try {
				int num = Integer.parseInt(response);
				raceToAdd = (DndRace) races.get(num);
				character.setCharRace(raceToAdd);
			} catch (IllegalArgumentException e) {
				System.out.println(response + " is not a valid value.");
				pickARace(character);
			} catch (IndexOutOfBoundsException e) {
				System.out.println(response + " is not a valid value.");
				pickARace(character);
			}
		} else {
			System.out.println("Please input a value");
			pickARace(character);
		}
		
		return character;
		
	}
	
	private Character pickAClass(Character character) {
		
		List<DndComponent> classes = characterCreator.getAvailableClasses();
		
		DndClass classToAdd;
				
		if (character.getCharClass() == null ) {
			System.out.println("Please pick a class for your character. The options are :");
		} else {
			System.out.println("Please pick a new class for your character."); 
			System.out.println("You current class is " + character.getCharClass().getName());
			System.out.println("Your options are: ");
		}
		
		displayComponents(classes);
		
		String response = getInput();
		
		if (response != "") {
			try {
				int num = Integer.parseInt(response);
				classToAdd = (DndClass) classes.get(num);
				character.setCharClass(classToAdd);
			} catch (IllegalArgumentException e) {
				System.out.println(response + " is not a valid value.");
				pickAClass(character);
			} catch (IndexOutOfBoundsException e) {
				System.out.println(response + " is not a valid value.");
				pickAClass(character);
			}
		} else {
			System.out.println("Please input a value");
			pickAClass(character);
		}
		
		return character;
		
	}

	private void displayComponents (List<DndComponent> listToChooseFrom) {
		
		for (DndComponent obj : listToChooseFrom) {
			System.out.println(listToChooseFrom.indexOf(obj) + ". " + obj.getName());
		}

	}

	public String getInput() {
		
		String input;
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input=br.readLine();
			return input;
		}
		catch(IOException io)
		{
//			io.printStackTrace();
			return "";
		}
		
	}

}
