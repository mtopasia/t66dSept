package first;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.json.simple.JSONObject;


public class Kordamine {

	public static void main(String[] args) {
	    
		Kordamine kordamine = new Kordamine();
		System.out.println(kordamine.hasUpperBegin("Mati"));
		System.out.println(kordamine.hawMoreUpperLettersThanLower("MaTT"));
		
	    JSONObject obj = new JSONObject();

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

		
	} 
	
	public boolean isWordInArrayList(String str, ArrayList<String> al) {
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	public String printJsonElement(JSONObject obj, String str) {
		
		return (String) obj.get(str);
	}
	
	public boolean isWordNumber(String str, int num) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// Put elements to the map132356
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
