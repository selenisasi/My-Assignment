package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Uniquechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1="sasirekha";
		char[] charArray1 = Str1.toCharArray();
		System.out.println(charArray1);
		int len = charArray1.length;
		Set<Character> S1=new LinkedHashSet<Character>();
		for (int i=0;i<len;i++)
		{
			S1.add(charArray1[i]);
		
		}
		System.out.println(S1);
	}

}
