package com.df.dnd.char_creator.model.impl;

import com.df.dnd.char_creator.model.DndComponent;

public class Equipment implements DndComponent{

	private String name;
	private int weight;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	

}
