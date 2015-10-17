package arraystring;

import java.util.Arrays;

public class InplaceReplacement {
	public static void main(String[] args) {
		String str = "Sherw ain e3456df    ";
		String input = "sherwain willi amsonrer";
		char[] chrStr = new char[input.length() + 4];
		chrStr = copyString(input, chrStr);
		//System.out.println(Arrays.toString(inplaceReplacement(chrStr, input.length() - 1)));
		System.out.println(replaceSpace(str.toCharArray(), str.trim().length()));
	}

	public static char[] copyString(String in, char[] chr) {
		int i = 0;
		for (char c : in.toCharArray())
			chr[i++] = c;
		return chr;
	}

	public static char[] inplaceReplacement(char[] chr, int length) {
		int end = length - 1;
		for (int i = 0; i < length; i++) {
			if (chr[i] == ' ') {
				for (int c = length; c > i; c--) {
					chr[c + 2] = chr[c];
				}

				chr[i++] = '%';
				chr[i++] = '0';
				chr[i] = '2';
				length = length + 2;
			}
		}
		return chr;
	}

	public static String replaceSpace(char[] chrset, int length) {
		if (length <= 1)
			return Arrays.toString(chrset);
		int end = chrset.length;
		
		System.out.println(Arrays.toString(chrset));
		
		for (int i = length - 1; i >= 0; i--) {
			if (chrset[i] == ' ') {
				chrset[--end] = '0';
				chrset[--end] = '2';
				chrset[--end] = '%';
				System.out.println(Arrays.toString(chrset));
			} else {
				chrset[--end] = chrset[i];
				System.out.println(Arrays.toString(chrset));
			}
		}
		return Arrays.toString(chrset);
	}

	public void replaceSpaces(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
	}
}
