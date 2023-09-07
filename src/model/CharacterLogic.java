/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Sep 6, 2023
 */
package model;

public class CharacterLogic {
	
	public int calcBaseHP(Character character) {
		String species = character.getSpecies();
		int baseHP = 0;
		switch (species) {
		case "elf": baseHP = 95; break;
		case "human": baseHP = 100; break;
		case "dwarf": baseHP = 105; break;
		case "orc": baseHP = 110; break;
		};
		return baseHP;
	}
	
	public int calcTotalHP(Character character) {
		int baseHP = calcBaseHP(character);
		int totalHP = baseHP + (10 * character.getCon());
		return totalHP;
	}
	
	public boolean isHuman(Character character) {
		if (character.getSpecies() == "human") {
			return true;
		}
		return false;
	}

}
