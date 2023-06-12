package edabit_Hard;
/*
Edabit
difficulty: Hard
exercise no. 8
---------------
edabit.com/challenges/java#!
edabit.com/challenge/LJDcfKERoPe8ERXG5
---------------
Write a function that takes the coordinates of three points and returns the perimeter of the triangle. The given points are the vertices of a triangle on a two-dimensional plane.
Examples
  perimeter(arr[0]={15, 7}, arr[1]={5, 22}, arr[2]={11, 1}) -> 47.08
  perimeter(arr[0]={0, 0}, arr[1]={0, 1}, arr[2]={1, 0}) -> 3.41
*/
import java.lang.Math;

public class exercise_08 {

	public static void main(String[] args) {
		double[][] triangle = {{15,7}, {5,22}, {11,1}};
		double pp = perimeter(triangle[0], triangle[1], triangle[2]);
		System.out.println(Double.toString(pp));
		return;
	}
	
	public static double perimeter(double[] A, double[] B, double[] C)
	{
		double[] s = {0, 0, 0};
		s[0] = distanceBetweenPoints(A[0], A[1], B[0], B[1]);
		s[1] = distanceBetweenPoints(A[0], A[1], C[0], C[1]);
		s[2] = distanceBetweenPoints(B[0], B[1], C[0], C[1]);
		double per = s[0] + s[1] + s[2];
		per = Math.round(per*100.0);
		per /= 100.0;
		return per;
	}
	
	private static double distanceBetweenPoints(double Ax, double Ay, double Bx, double By)
	{
		double x2 = Math.pow(Bx-Ax, 2);
		double y2 = Math.pow(By-Ay, 2);
		return Math.sqrt(x2+y2);
	}
}
