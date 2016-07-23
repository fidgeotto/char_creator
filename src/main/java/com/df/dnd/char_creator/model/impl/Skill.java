package com.df.dnd.char_creator.model.impl;

import java.util.List;

public class Skill {

	private String name;
	private boolean untrained;
	private String associatedAbility;
	private List<String> skillClasses;
	private int armorCheckMultiplier;
	
	
	public Skill(String name, boolean untrained, String associatedAbility, String[] skillClassArray, int armorCheckMultiplier) {
		super();
		this.name = name;
		this.untrained = untrained;
		this.associatedAbility = associatedAbility;
		for (String skillClass : skillClassArray ) {
			skillClasses.add(skillClass);
		}
		this.armorCheckMultiplier=armorCheckMultiplier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isUntrained() {
		return untrained;
	}

	public void setUntrained(boolean untrained) {
		this.untrained = untrained;
	}

	public String getAssociatedAbility() {
		return associatedAbility;
	}

	public void setAssociatedAbility(String associatedAbility) {
		this.associatedAbility = associatedAbility;
	}

	public List<String> getSkillClasses() {
		return skillClasses;
	}

	public void setSkillClasses(List<String> skillClasses) {
		this.skillClasses = skillClasses;
	}

	public int getArmorCheckMultiplier() {
		return armorCheckMultiplier;
	}

	public void setArmorCheckMultiplier(int armorCheckMultiplier) {
		this.armorCheckMultiplier = armorCheckMultiplier;
	}
	
	
}
