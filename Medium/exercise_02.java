package edabit_Medium;
/*
  Edabit
  difficulty: Medium
  exercise no. 2
  ---------------
  edabit.com/challenges/java#!
  edabit.com/challenge/rzpucPyoyEtXPo2BG
  ---------------
  Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of "num" until the array length reaches "length". 
*/

public class exercise_02 {

	public static void main(String[] args) {
		int how_many = 7;
		int number = 3;
		int x;
		int[] arr = new int[how_many];
		arr = arrayOfMutiples(number, how_many);
		String writing = Integer.toString(how_many) +" multiple(s) of ";
		writing += Integer.toString(number) + " are: ";
		for(x=0; x<how_many; x++)
		{
			writing += Integer.toString(arr[x]) +" ";
		}
		System.out.println(writing);
		return;
	}
	
	public static int[] arrayOfMutiples(int num, int length)
	{
		if(length<1)
		{ length = 1; }
		int[] results = new int[length];
		results[0] = num;
		int a = 0;
		for(a=1; a<length; a++)
		{
			results[a] = results[a-1] + num;
		}
		return results;
	}
}
