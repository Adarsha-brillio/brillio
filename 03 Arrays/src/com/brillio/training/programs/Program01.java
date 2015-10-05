package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {

	public static void increment(int[] ar, int by) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += by;
		}
	}

	public static void main(String[] args) {
		// n is a reference to an array object
		int[] n = new int[3];
		n[1] = 23;
		n[0] = 12;
		n[2] = 65;

		int index = 2;
		System.out.println(n[index]);

		// n[3] = 21;// throws array index out of bound exception
		// n[-2] = 34;// throws array index out of bound exception
		System.out.println(Arrays.toString(n));
		increment(n, 10);
		System.out.println(Arrays.toString(n));
	}
}
