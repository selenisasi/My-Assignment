package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,9,4,6,7,2,3,3,6,7,10,8,1};
		Set<Integer> S1=new TreeSet<Integer>();
		for (int i=0;i<data.length;i++)
		{
			S1.add(data[i]);
		}
		System.out.println(S1);
		List<Integer> L1=new ArrayList<Integer>(S1);
		System.out.println(L1);
		int len=L1.size();
		for (int j=1;j<len;j++)
		{
			if(j!=L1.get(j-1))
			{
			int k=L1.get(j-1);
			System.out.println(k-1);
			break;
			}
			
			}
		}
	}


