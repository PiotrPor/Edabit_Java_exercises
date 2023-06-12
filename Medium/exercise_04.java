package edabit_Medium;
/*
Edabit
difficulty: Medium
exercise no. 4
---------------
edabit.com/challenges/java#!
edabit.com/challenge/7fHsizQrTLXsPWMyH
---------------
There's a great war between the even and odd numbers. Many numbers already lost their lives in this war and it's your task to end this. You have to determine which group sums larger: the evens, or the odds. The larger group wins.
Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.
*/

public class exercise_04 {

	public static void main(String[] args) {
		int[] battle_array = {2, 12, 5, 31, 56, 19, 7, 7};
		int difference = warOfNumbers(battle_array);
		if(difference > 0)
		{
			System.out.println("Even numbers won.");
		}
		else if(difference < 0)
		{
			System.out.println("Odd numbers won.");
		}
		else
		{
			System.out.println("War ended with a draw.");
		}
		return;
	}
	
	public static int warOfNumbers(int[] given)
	{
		int substract;
		int sum_of_even = 0;
		int sum_of_odd = 0;
		int array_length = given.length;
		int x;
		for(x=0; x<array_length; x++)
		{
			if(given[x]%2 == 0)
			{ 
				sum_of_even += given[x]; 
			}
			else
			{ 
				sum_of_odd += given[x]; 
			}
		}
		substract = sum_of_even - sum_of_odd;
		return substract;
	}
}
