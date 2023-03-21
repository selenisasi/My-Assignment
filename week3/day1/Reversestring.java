package week3.day1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Amazon";
		str=str.toLowerCase();
		char[] c1 = str.toCharArray();
		for (int i=c1.length-1;i>=0;i--)
		{
			System.out.println(c1[i]);
			
		}
	}

}
