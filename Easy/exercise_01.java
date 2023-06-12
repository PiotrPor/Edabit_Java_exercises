package edabit_Easy;
/*
Edabit
difficulty: Easy
exercise no. 1
---------------
edabit.com/challenges/java#!
edabit.com/challenge/vKpGt4ufSKmEJ3Xjd
---------------
Create a function which returns the number of true values there are in an array.
Return 0 if given an empty array.
All array items are of the type bool.
Examples:
  countTrue([true, false, false, true, false]) -> 2
  countTrue([false, false, false, false]) -> 0
  countTrue([]) -> 0
*/

public class exercise_01 {

	public static void main(String[] args) {
		boolean[] test_array = {false, false, true, false, true, false, false};
		int xyz = countTrue(test_array);
		System.out.println(Integer.toString(xyz));
		return;
	}
	
	public static int countTrue(boolean[] arr)
	{
		int quantity = 0;
		if(arr.length > 0)
		{
			int a;
			for(a=0; a < arr.length; a++)
			{
				if(arr[a])
				{
					quantity++;
				}
			}
		}
		return quantity;
	}
}
