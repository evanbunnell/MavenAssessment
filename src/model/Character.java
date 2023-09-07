/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Sep 6, 2023
 */
package model;

public class Character {
	
	private String name;
	private String species;
	private int healthPoints;
	private int constitution;
	
	public Character() {
		super();
	}
	
	public Character(String species, int constitution) {
		super();
		this.species = species;
		this.constitution = constitution;
	}

	/**
	 * Getters
	 * @return name
	 * @return species
	 * @return healthPoints
	 * @return constitution
	 */
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	public int getHP() {
		return healthPoints;
	}
	public int getCon() {
		return constitution;
	}

	/**
	 * Setters
	 * @param name - character's name
	 * @param species - character's species
	 * @param healthPoints - number of health points a character has
	 * @param constitution - character's constitution value
	 */
	public void setName(String name) {
		this.name = name.toLowerCase();
	}
	public void setSpecies(String species) {
		this.species = species.toLowerCase();
	}
	public void setHP(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public void setCon(int constitution) {
		this.constitution = constitution;
	}
	
}
