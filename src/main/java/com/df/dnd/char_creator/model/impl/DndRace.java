package com.df.dnd.char_creator.model.impl;

import java.util.HashMap;
import java.util.Map;

import com.df.dnd.char_creator.model.DndComponent;

public class DndRace implements DndComponent {
	
	String name;
	Map<String, Integer> abilityScoreMods = new HashMap<String, Integer>();
	
	public DndRace(){
		abilityScoreMods.put("str", 0);
		abilityScoreMods.put("dex", 0);
		abilityScoreMods.put("con", 0);
		abilityScoreMods.put("int", 0);
		abilityScoreMods.put("wis", 0);
		abilityScoreMods.put("cha", 0);
	}
	
	public DndRace(String name){
		this.name = name;
		abilityScoreMods.put("str", 0);
		abilityScoreMods.put("dex", 0);
		abilityScoreMods.put("con", 0);
		abilityScoreMods.put("int", 0);
		abilityScoreMods.put("wis", 0);
		abilityScoreMods.put("cha", 0);
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		
	}

	public Map<String, Integer> getAbilityScoreMods() {
		return abilityScoreMods;
	}
	
	public void updateAbilityScoreMod(String key, int value){
		abilityScoreMods.replace(key, value);
	}

}
