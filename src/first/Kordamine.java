package first;

import java.util.HashMap;

public class Kordamine {

	public static void main(String[] args) {
		Kordamine kordamine = new Kordamine();
		System.out.println(kordamine.hasUpperBegin("Mati"));
		System.out.println(kordamine.hawMoreUpperLettersThanLower("MaTT"));
		
	}
	
	public boolean isWordNumber(String str, int num) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// Put elements to the map
		hm.put(1, "üks");
		hm.put(2, "kaks");
		hm.put(3, "kolm");
		hm.put(4, "neli");
		hm.put(5, "viis");
		return hm.get(num).equals(str);
	}

	public boolean hasUpperBegin(String str) {

		return str.substring(0, 1).equals(str.substring(0, 1).toUpperCase());
	}
	
	public boolean hawMoreUpperLettersThanLower(String str) {
		int capLetter=0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
	            capLetter++;
	        }	
		}
		return capLetter> str.length()-capLetter;
	}
}
