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


public class CharacterBoolTest {
	Character character = new Character();
	CharacterLogic charLog = new CharacterLogic();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsNotHuman() {
		character.setSpecies("dwarf");
		assertFalse(charLog.isHuman(character));
	}
	
	@Test
	public void testIsHuman() {
		character.setSpecies("human");
		assertTrue(charLog.isHuman(character));
	}

}
