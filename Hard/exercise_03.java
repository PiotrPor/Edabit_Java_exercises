package edabit_Hard;
/*
Edabit
difficulty: Hard
exercise no. 3
---------------
edabit.com/challenges/java#!
edabit.com/challenge/dreQhsnZJ7HGtsts5
---------------
Create a function that recursively counts the integer's number of digits.
Examples:
  count(318) -> 3
  count(-92563) -> 5
  count(4666) -> 4
*/

public class exercise_03 {
	
	private static boolean first;
	
	public static void main(String[] args) {
		first = true;
		int number = 1000;
		int how_many_digits = count(number);
		String text = Integer.toString(number) + " has ";
		text += Integer.toString(how_many_digits) + " digit(s)";
		System.out.println(text);
		return;
	}
	
	public static int count(int num)
	{
		if(first)
		{
			if(num == 0)
			{
				return 1;
			}
			else
			{
				first = false;
			}
		}
		//
		if(num == 0)
		{
			return 0;
		}
		else
		{
			num /= 10;
			return count(num) + 1;
		}
	}
}
