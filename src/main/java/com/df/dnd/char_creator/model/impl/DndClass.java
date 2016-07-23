package com.df.dnd.char_creator.model.impl;

import com.df.dnd.char_creator.model.DndComponent;

public class DndClass implements DndComponent{
	
	private String name;
	private int hitDice;
	private int attackBonus;
	private int fortSave;
	private int refSave;
	private int willSave;
	private int skillNumber;

	
	public DndClass (String name) {
		this.name = name;
	}
	
	public DndClass (String name, int hitDice, int attackBonus, int fortSave, int refSave, int willSave, int skillNumber) {
		this.name = name;
		this.hitDice = hitDice;
		this.attackBonus = attackBonus;
		this.fortSave = fortSave;
		this.refSave = refSave;
		this.willSave = willSave;
		this.skillNumber = skillNumber;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getHitDice() {
		return hitDice;
	}

	public void setHitDice(int hitDice) {
		this.hitDice = hitDice;
	}

	public int getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}

	public int getFortSave() {
		return fortSave;
	}

	public void setFortSave(int fortSave) {
		this.fortSave = fortSave;
	}

	public int getRefSave() {
		return refSave;
	}

	public void setRefSave(int refSave) {
		this.refSave = refSave;
	}

	public int getWillSave() {
		return willSave;
	}

	public void setWillSave(int willSave) {
		this.willSave = willSave;
	}

	public int getSkillNumber() {
		return skillNumber;
	}

	public void setSkillNumber(int skillNumber) {
		this.skillNumber = skillNumber;
	}
}
