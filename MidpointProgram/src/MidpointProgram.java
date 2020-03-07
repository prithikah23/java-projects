/*
 * Name: Prithika Hariharan
 * WatID: 20813370
 * Date: 3rd March, 2020
 * Assignment 6, Q3
 * Description: Checks whether one of the values passed is the midpoint of the other two points
 * Input: The method takes input from the user in the form of parameters
 * Output: It returns true or false based on whether the condition is satisfied
 * */
public class MidpointProgram {

	public static void main(String[] args) {
		System.out.println(hasMidpoint(2, 1, 4));
	}

	// method that checks for checkpoint
	public static boolean hasMidpoint(int a, int b, int c) {
		return (((double) (a + b) / 2) == c || ((double) (c + b) / 2) == a || ((double) (c + a) / 2) == b);
	}
}
