package week1.day2;

import java.util.Arrays;

public class Findduplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,7,7,5,9,2,3};
		int len = nums.length;
		Arrays.sort(nums);
		for (int i=0;i<len;i++)
		{
			if(nums[i]==nums[i+1])
			{
				System.out.println(nums[i]);
			}
		}

	}

}
