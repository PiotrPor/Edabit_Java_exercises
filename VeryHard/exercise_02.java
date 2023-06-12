package VeryHard;
/*
Edabit
difficulty: Very Hard
exercise no. 2
---------------
edabit.com/challenges/java#!
edabit.com/challenge/kKQPf5xTAdnBjqvZ8
---------------
Write a function that groups a string into parentheses clusters. 
Each cluster should be balanced.
All input strings will only contain parentheses.
Balanced: Every "(" must exist with its ")" in the same cluster.
Examples
  split("()()()") -> ["()", "()", "()"]
  split("((()))") -> ["((()))"]
  split("((()))(())()()(()())") -> ["((()))", "(())", "()", "()", "(()())"]
  split("((())())(()(()()))") -> ["((())())", "(()(()()))"]
*/
import java.util.ArrayList;

public class exercise_02 {

	public static void main(String[] args) {
		String[] test_arr = split("((()))(())()()(()())");
		//
		int size = test_arr.length;
		int x;
		for(x=0; x<size; x++)
		{
			System.out.println(test_arr[x]);
		}
		return;
	}
	
	public static String[] split(String str)
	{
		ArrayList<String> all_strings = new ArrayList<String>();
		char[] char_string = str.toCharArray();
		int depth = 0;
		String sss;
		int size = char_string.length;
		int a;
		for(a=0; a<size; a++)
		{
			sss = "";
			while(true)
			{
				sss += char_string[a];
				if(char_string[a] == '(')
				{
					depth++;
				}
				else
				{
					depth--;
				}
				if(depth == 0)
				{
					break;
				}
				a++;
			}
			all_strings.add(sss);
		}
		int how_many = all_strings.size();
		String[] result = new String[how_many];
		for(a=0; a<how_many; a++)
		{
			result[a] = all_strings.get(a);
		}
		return result;
	}
}
