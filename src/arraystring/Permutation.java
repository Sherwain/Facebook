package arraystring;

import java.util.HashSet;

public class Permutation {
	public static void main(String[] args){
		String str = "abcd";
		System.out.println(permutate(str, "dabc"));
	}
	
	public static boolean permutate(String str, String val){
		HashSet<String> set = new HashSet<String>();	
		set = permutate(str, "", 0, str.length(), set);
		System.out.println(set);
		return set.contains(val);
	}
	
	public static HashSet<String> permutate(String val, String append, int cnt, int len, HashSet<String> set ){
		if (val.isEmpty() || len == cnt)
			return set;
		set.add(append + val);
		permutate(val.substring(1) + val.charAt(0), append, ++cnt, len, set);
		permutate(val.substring(1), append + val.substring(0,1), 0, val.substring(1).length(), set);
		return set;
	}
	
	
	public static boolean test(String s, String t){
		if (t.length() != s.length())
			return false;
		int t_val = 0,  s_val = 0;
		for (int i = 0 ; i < t.length(); i++){
			t_val += t.charAt(i);
			s_val += s.charAt(i);
		}		
		return s_val == t_val;
	}
}
