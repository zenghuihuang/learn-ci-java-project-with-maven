package games;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {
	
	@Test
	 void testPlayer() {

		Player player = new Player();
		int expected= 6;
		int actual = player.add(2, 4);
		assertEquals(expected, actual);
		
		
	}
	@Test
	 void testCell() {
		
		Cell ce = new Cell(29);
		ce.setStatus("Head of Snake", 12);
		assertEquals(12,ce.getGoTo());
		
	}
	
	
	
	

}
