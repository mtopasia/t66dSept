package first;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTests {
	
	Kordamine kordamine = new Kordamine();

	@Test
	public void upperBeginningChecksFirstCharacter() {
		assertTrue(kordamine.hasUpperBegin("Mati"));
		assertFalse(kordamine.hasUpperBegin("mati"));
	}
	@Test
	public void MoreUpperLettersThanLower() {
		assertTrue(kordamine.hawMoreUpperLettersThanLower("MaTT"));
		
	}
	
	@Test
	public void stringEqualsNumber() {
		assertTrue(kordamine.isWordNumber("üks", 1));
	}
	
	@Test
	public void stringdoesnotEqualsNumber() {
		assertFalse(kordamine.isWordNumber("üks", 4));
	}
	
	

}
