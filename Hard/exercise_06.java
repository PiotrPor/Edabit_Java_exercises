package edabit_Hard;
/*
Edabit
difficulty: Hard
exercise no. 6
---------------
edabit.com/challenges/java#!
edabit.com/challenge/qSJ5hZfG52Nf2hXWS
---------------
Given an array of integers, return the largest gap between the sorted elements of the array.
For example, consider the array:
  [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
... in which, after sorting, the array becomes:
  [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
... so that we now see that the largest gap in the array is between 9 and 20 which is 11.
*/
import java.util.Arrays;

public class exercise_06 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 20, 8, 1, 5, 19};
		int LG = largestGap(arr);
		System.out.println(Integer.toString(LG));
		return;
	}
	
	public static int largestGap(int[] given)
	{
		int largest_gap = 0;
		int size = given.length;
		if(size > 1)
		{
			Arrays.sort(given);
			int a;
			int diff;
			for(a=0; a<(size-1); a++)
			{
				diff = given[a+1] - given[a];
				if(diff > largest_gap)
				{
					largest_gap = diff;
				}
			}
		}
		return largest_gap;
	}
}
