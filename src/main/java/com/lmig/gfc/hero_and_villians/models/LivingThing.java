package com.lmig.gfc.hero_and_villians.models;

public class LivingThing {
	
	protected String name;
	protected int health;
	
	public LivingThing() {
		
	}
	
	public LivingThing(String name, int health) {
		this.name = name;
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	

}
