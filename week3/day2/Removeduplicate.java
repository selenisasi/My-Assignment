package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="I am am a java java developer one one";
		String[] split1 = S1.split(" ");
		int l1 = split1.length;
		for (int i=0;i<l1;i++)
		{
		System.out.println(split1[i]);
		}
		//String string = S1.replaceAll(" ", ",");
		//System.out.println(string);
		
		Set<String> Set1=new LinkedHashSet<String>();
		for (int i=0;i<l1;i++)
		{
	
			Set1.add(split1[i]);
			
		}
	System.out.println(Set1);		

	}

	
}
