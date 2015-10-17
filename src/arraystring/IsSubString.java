package arraystring;

public class IsSubString {
	public static void main(String[] args){
		String str1 = "waterbottLe";
		String str2 = "erbrottLewat";
		System.out.println(testSubString(str1, str2));
	}
	
	public static boolean testSubString(String str1, String str2){
		if (str1.length() < str2.length() || str1.length() ==0 )
			return false;
		
		String concat = str1 + str1;
		
		return concat.contains(str2);
	}
}
