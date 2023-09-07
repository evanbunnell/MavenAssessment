/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Sep 6, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Character;
import model.CharacterLogic;

public class CharacterTest {
	Character character = new Character();
	CharacterLogic charLog = new CharacterLogic();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalcBaseHP() {
		character.setSpecies("dwarf");
		int baseHP = charLog.calcBaseHP(character);
		assertEquals(105, baseHP, 0.0);
	}
	
	@Test
	public void testCalcTotalHP() {
		character.setSpecies("elf");
		character.setCon(10);
		int totalHP = charLog.calcTotalHP(character);
		assertEquals(195, totalHP, 0.0);
	}

}
