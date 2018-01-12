package com.lmig.gfc.hero_and_villians.models;

public class Hero extends LivingThing {
	
	private String secretIdentity;
	
	public Hero() {
		
	}

	public Hero(String name, int health, String secretIdentity) {
		super(name, health);
		this.secretIdentity = secretIdentity;
	}

	public String getSecretIdentity() {
		return secretIdentity;
	}

	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}
	
	
}
