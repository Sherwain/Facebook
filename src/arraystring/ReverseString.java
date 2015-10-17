package arraystring;

public class ReverseString {
	public static void main(String[] args){
		String str = "sherwain";
		reverse(str);
	}
	
	public static void reverse(String str){
		StringBuilder strB = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i-- ){
			strB.append(str.charAt(i));
		}
		System.out.println(strB);
	}
}
