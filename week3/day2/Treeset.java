package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> S1=new TreeSet<Integer>();
		for (int i=0;i<data.length;i++)
		{
			S1.add(data[i]);
		}
		System.out.println(S1);
		List<Integer> L1=new ArrayList<Integer>(S1);
		System.out.println(L1);
		Collections.sort(L1);
		System.out.println(L1.get(4));
	}
}
