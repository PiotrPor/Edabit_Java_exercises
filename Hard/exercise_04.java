package edabit_Hard;
/*
Edabit
difficulty: Hard
exercise no. 4
---------------
edabit.com/challenges/java#!
edabit.com/challenge/Md6usCHQ7Xsj2fQi3
---------------
Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers where each number appears exactly once.
*/
import java.util.Arrays;

public class exercise_04 {

	public static void main(String[] args) {
		int[] test_array = {2, 4, 6, -1, 3, 7, 5};
		if(cons(test_array))
		{
			System.out.println("A consuctive list could be formed from these numbers");
		}
		else
		{
			System.out.println("These numbers cannot be arranged into a consuctive list");
		}
		return;
	}
	
	public static boolean cons(int[] given)
	{
		Arrays.sort(given);
		int size = given.length;
		int a = given[0];
		int b = given[size-1];
		return (b-a+1 == size);
	}
}
