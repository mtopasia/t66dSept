package first;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	@Test
	public void stringExistInArray() {
		
		assertTrue(kordamine.isWordInArrayList("E", initListData()));
	}
	
	private ArrayList<String> initListData() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		return al;
	}

}
