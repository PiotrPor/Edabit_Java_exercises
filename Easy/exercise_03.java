package edabit_Easy;
/*
Edabit
difficulty: Easy
exercise no. 3
---------------
edabit.com/challenges/java#!
edabit.com/challenge/PZnwXraqBPYv7w4Sm
---------------
Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.
All test cases are valid one word strings.
Example
  checkEnding("feminine", "nine") -> true
*/

public class exercise_03 {

	public static void main(String[] args) {
		String s1 = "feminine";
		String s2 = "nine";
		if(checkEnding(s1, s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		return;
	}
	
	public static boolean checkEnding(String first, String second)
	{
		boolean bb = true;
		int len1 = first.length();
		int len2 = second.length();
		int a;
		int diff = len1-len2;
		for(a=diff; a<len1; a++)
		{
			if(first.charAt(a) != second.charAt(a-diff))
			{
				bb = false;
				break;
			}
		}
		return bb;
	}
}
