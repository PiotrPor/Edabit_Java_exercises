package edabit_Hard;
/*
Edabit
difficulty: Hard
exercise no. 1
---------------
edabit.com/challenges/java#!
edabit.com/challenge/CKqfEowjmSTw2jsso
---------------
Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. 
Otherwise, return "there is no 7 in the array".
*/

public class exercise_01 {

	public static void main(String[] args) {
		int[] test_array = {2, 500, 27, 8, 3};
		System.out.println(sevenBoom(test_array));
		return;
	}
	
	public static String sevenBoom(int[] given)
	{
	    boolean found = false;
	    int x;
	    for(x=0; x<given.length; x++)
	    {
	    	if(Integer.toString(given[x]).contains("7"))
	    	{
	    		found = true;
	    		break;
	    	}
	    }
	    if(found)
	    {
	    	return "Boom!";
	    }
	    else
	    {
	    	return "There is no number 7";
	    }
	}
}
