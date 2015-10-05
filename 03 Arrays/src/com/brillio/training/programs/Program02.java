package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {
	public static void main(String[] args) {
		int[][] num = { { 1, 2 }, { 2, 6, 9 }, { 5, 8, 7, 10, 4 }, { 5, 2, 2, 7 } };
		for (int i = 0; i < num.length; i++) {
			System.out.println(Arrays.toString(num[i]));
		}
	}
}
