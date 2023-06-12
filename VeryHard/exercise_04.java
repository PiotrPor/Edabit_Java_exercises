package VeryHard;
/*
Edabit
difficulty: Very Hard
exercise no. 4
---------------
edabit.com/challenges/java#!
edabit.com/challenge/KZrmicjc8zCZyGNee
---------------
It's time to send and receive secret messages.
Create two functions that take a string and an array and returns a coded or decoded message.
The first letter of the string, or the first element of the array represents the Character Code of that letter. The next elements are the differences between the characters: e.g. A +3 --> C or z -1 --> y.

Examples
  encrypt("Hello") -> [72, 29, 7, 0, 3]
  // H = 72, the difference between the H and e is 29 (upper- and lowercase).
  // The difference between the two l's is obviously 0.
  decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) -> "Hi there!"
  encrypt("Sunshine") -> [83, 34, -7, 5, -11, 1, 5, -9]

Notes
    The input of the encrypt function will always be a string.
    The input of the decrypt function will always be an array with numbers.
*/

public class exercise_04 {

	public static void main(String[] args) {
		int[] encrypted_message = {72, 33, -73, 84, -12, -3, 13, -13, -68};
		String visible_message = "Sunshine";
		//
		String decr = decrypt(encrypted_message);
		int[] encr = encrypt(visible_message);
		//
		System.out.println(decr);
		int a;
		for(a=0; a<encr.length; a++)
		{
			System.out.print(Integer.toString(encr[a]) +" ");
		}
		return;
	}
	
	public static int[] encrypt(String str)
	{
		char[] char_array = str.toCharArray();
		int size = str.length();
		int[] encrypted = new int[size];
		int[] ascii_text = new int[size];
		int a;
		for(a=0; a<size; a++)
		{
			ascii_text[a] = (int)char_array[a];
		}
		encrypted[0] = ascii_text[0];
		for(a=1; a<size; a++)
		{
			encrypted[a] = ascii_text[a] - ascii_text[a-1];
		}
		return encrypted;
	}
	
	public static String decrypt(int[] given)
	{
		int size = given.length;
		char[] as_char = new char[size];
		int[] only_int = new int[size];
		int a;
		only_int[0] = given[0];
		for(a=1; a<size; a++)
		{
			only_int[a] = only_int[a-1] + given[a];
		}
		for(a=0; a<size; a++)
		{
			as_char[a] = (char)only_int[a];
		}
		return new String(as_char);
	}
}
