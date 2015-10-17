package stacks;

import java.util.Arrays;

public class StackDriver {
	public static void main(String[] args){
		Stack<Integer> stacks = new Stack<Integer>();
		stacks.push(12);
		stacks.push(132);
		stacks.push(15);
		stacks.push(65);
		stacks.push(23);
		stacks.push(76);
		stacks.push(23);
		
		System.out.println(stacks);
		System.out.println(stacks.peek());
		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks.peek());
		System.out.println(stacks.peek());
		System.out.println(stacks.getSize());
	}
	
	public static String replaceSpace(char[] chrset, int length){
        if (length <= 1)
            return Arrays.toString(chrset);
        int dif = chrset.length - length;
        
        for (int i = length; i > 0; i--){
            if (chrset[i] == ' '){
                chrset[i] = '%';
                chrset[i+1] = '2';
                chrset[i+2] = '0';
            }
            else{
                chrset[i + dif] = chrset[i];
            }

        }
        return Arrays.toString(chrset);
    }
}
