package arraystring;


public class CompressString {
	public static void main(String[] arrgs){
		String str = "aabcccccaaajmkh6567fghhyh";
		StringBuilder strB = new StringBuilder(str);
		System.out.println(compressString(strB));
	}
	
	public static String compressString(StringBuilder input){
		if (input.length() < 1)
			return input.toString();

		int tail = 0, head;
		for(head = 1; head <= input.length() -1; head++){
			if (head == input.length() -1) //end of string
				if (tail + 1 == head){//adjacent index
					if (input.charAt(head) == input.charAt(tail)){ // consecutive ending
						input.replace(tail + 1, head+1, Integer.toString(((head + 1)- tail)));
						head = input.length();
					}
					else{//different characters at the end
						input.insert(head, Integer.toString(1));
						head = input.length();
						input.insert(head, Integer.toString(1));
					}
				}
				else{
					input.replace(tail + 1, head+1, Integer.toString(((head + 1) - tail)));
				}
			else if (input.charAt(head) != input.charAt(tail)) {
				input.replace(tail + 1, head, Integer.toString((head - tail)));
				tail = tail + Integer.toString((head - tail)).length() + 1;
				head = tail;
			}
		}
		return input.toString();
	}
}
