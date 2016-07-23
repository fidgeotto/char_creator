package com.df.dnd.char_creator.model.impl;

import java.util.HashMap;
import java.util.Map;

public class Helper {

	public Map<String, Integer> getAbilityMap() {
		Map<String, Integer> abilityMap = new HashMap<String, Integer>();
		abilityMap.put("str", 0);
		abilityMap.put("dex", 0);
		abilityMap.put("con", 0);
		abilityMap.put("int", 0);
		abilityMap.put("wis", 0);
		abilityMap.put("cha", 0);
		
		return abilityMap;
	}
	
}
