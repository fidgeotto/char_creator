package com.df.dnd.char_creator.controller;

import java.util.Map;

import com.df.dnd.char_creator.model.impl.Character;
import com.df.dnd.char_creator.model.impl.Helper;

public class CharacterCalculator {
	
	Helper helper = new Helper();
	
	public Map<String, Integer> calculateOverallAbilityScores(Character character) {
		
		int total;
		Map<String, Integer> overallScores = helper.getAbilityMap();
		Map<String, Integer> assignedScores = character.getAssignedAbilityScores();
		Map<String, Integer> raceMods = character.getCharRace().getAbilityScoreMods();
	
//		System.out.println("Scores from dice rolls: " + assignedScores);
//		System.out.println("Racial modifiers: " + raceMods);
		
		for (String ability : overallScores.keySet()) {
			total = assignedScores.get(ability) + raceMods.get(ability);
//			System.out.println("For ability " + ability + " total score is " + total);
			overallScores.replace(ability, total);
		}
		
//		System.out.println("Total ability scores are: " + overallScores);
		
		return overallScores;
	}
	
	public Map<String, Integer> calculateAbilityModifiers (Character character) {
		
		Map<String, Integer> abilityScores = calculateOverallAbilityScores(character);
		Map<String, Integer> abilityMods = helper.getAbilityMap();
		Integer score;
		Integer modifier;
		
//		System.out.println("Ability Scores: " + abilityScores);
//		System.out.println("Ability Mods: " + abilityMods);
		
		for (String key : abilityScores.keySet()) {
			score = abilityScores.get(key);
			modifier = Math.floorDiv((score - 10), 2);
//			System.out.println("For key " + key + " this characters score is " + score + " and the modifier is " + modifier);
			abilityMods.replace(key, modifier);
		}
		
		return abilityMods;
	}
	
	public int calculateMeleeAttackBonus (Character character) {
		int meleeAttackBonus;
		
		int classAttackBonus = character.getCharClass().getAttackBonus();
		int strengthMod = calculateAbilityModifiers(character).get("str");
		
		meleeAttackBonus = classAttackBonus + strengthMod;
		
		return meleeAttackBonus;
	}
	
	public int calculateRangedAttackBonus (Character character) {
		int rangedAttackBonus;
		
		int classAttackBonus = character.getCharClass().getAttackBonus();
		int dexMod = calculateAbilityModifiers(character).get("dex");
		
		rangedAttackBonus = classAttackBonus + dexMod;
		
		return rangedAttackBonus;
	}
	
}
