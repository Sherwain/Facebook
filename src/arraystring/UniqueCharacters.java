package arraystring;

import java.util.Arrays;

public class UniqueCharacters {
	public static void main(String[] args){
		String input = "1Sherwainyou23";
		System.out.println(isUnique(input));
		
	}
	
	public static boolean isUnique(String input){
		if (input.length() > 266)
			return false;
		
		boolean[] char_set = new boolean[256];
		for (Character c : input.toCharArray()){
			if (char_set[Character.getNumericValue(c)])
				return false;
			char_set[Character.getNumericValue(c)] = true;
			
		}
		
		System.out.println(Arrays.toString(char_set));
		return true;
	}
}

//628704719