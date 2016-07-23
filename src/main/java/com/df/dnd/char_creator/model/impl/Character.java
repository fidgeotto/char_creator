package com.df.dnd.char_creator.model.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Character {
	
	private DndClass charClass;
	private DndRace charRace;
	private Map<String, Integer> assignedAbilityScores;
	private int hitPoints;
	private List<Equipment> equipment;
	private Map<Skill, Integer> skills;
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public DndClass getCharClass() {
		return charClass;
	}
	
	public void setCharClass(DndClass charClass) {
		this.charClass = charClass;
	}
	
	public DndRace getCharRace() {
		return charRace;
	}
	
	public void setCharRace(DndRace charRace) {
		this.charRace = charRace;
	}
	
	public Map<String, Integer> getAssignedAbilityScores() {
		return assignedAbilityScores;
	}
	
	public void setAssignedAbilityScores(Map<String, Integer> assignedAbilityScores2) {
		this.assignedAbilityScores = assignedAbilityScores2;
	}
	
	public HashMap<String, Integer> getAbilityScores() {
		HashMap<String, Integer> racialMods = (HashMap<String, Integer>) charRace.getAbilityScoreMods();
		String[] abilities = {"str", "dex", "con", "wis", "int", "cha"};
		
		HashMap<String, Integer> totalScores = new HashMap<String, Integer>();
		
		for (String ability : abilities) {
			int totalMod = racialMods.get(ability) + assignedAbilityScores.get(ability);
			totalScores.put(ability, totalMod);
		}
		
		return totalScores;
	}

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}

	public Map<Skill, Integer> getSkills() {
		return skills;
	}

	public void setSkills(Map<Skill, Integer> skills) {
		this.skills = skills;
	}

}
