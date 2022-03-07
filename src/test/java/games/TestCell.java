package games;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCell {
	Cell cell = new Cell(4);	

	@Test
	public void testGetStatus() {	
		assertTrue(cell.getStatus()=="");	
	}
	
	@Test
	public void testGetBiscuit() {
		cell.setBiscuit();
		assertTrue(cell.getBiscuit());
	}

}
