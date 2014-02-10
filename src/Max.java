/*
 * 
 * Practice with recursion -- finding max in array of integers
 * 
 */

import java.util.Scanner;

public class Max {

	public static int foo(int[] A) {
		return foo(A, 0, A.length - 1);
	}

	private static int foo(int[] A, int lo, int hi) {
		if (lo >= hi)
			return A[lo];
		int tmp1 = foo(A, lo, (lo + hi) / 2);
		int tmp2 = foo(A, (lo + hi) / 2 + 1, hi);
		return ((tmp1 < tmp2) ? tmp2 : tmp1);
	}

	public static void main(String[] args) {

		System.out
				.println("This program will find the max out of any group of numbers!");

		// read in an array from keyboard
		System.out.println("How many numbers do you want to input?");
		Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		System.out.println("Please enter " + size
				+ " numbers without any decimal points:");

		// create the array and fill it up with numbers input by user.
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = keyboard.nextInt();
		}

		// System.out.println("The array is: " + a[0] + " " + a[1] + " " + a[2]
		// + " " +
		// a[3] + " "+ a[4] + " "+ a[5]);
		int index = 0;
		int max = Max.foo(a);

		System.out.println("The maximum of all the numbers is: " + max);
	}

}
