package com.amine.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300 ;
	}
	public void fly() {
		System.out.println("Bat taking off");
		setEnergyLevel(getEnergyLevel()-50);
	}
	public void eatHumans() {
		System.out.println("Bat has eaten a human!");
		setEnergyLevel(getEnergyLevel()+25);
	}
	public void attackTown() {
		System.out.println(" Bat has attacked a Town");
		setEnergyLevel(getEnergyLevel()- 100);
	}
	
}
