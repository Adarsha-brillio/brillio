package com.brillio.training.programs;

public class Program05 {
	public static void main(String[] args) {

		// to supply command line arguments in eclipse
		// use the menu "Run"->"Run Configurations.."
		// select the "Arguments" tab
		// pass the values through "Program arguments"

		// to supply arguments with space, use the double quotes

		// to supply double quotes as part of the input,escape them
		// for example: "5' 10\"" will be accepted as 5' 10"

		System.out.println("There are " + args.length + " Command line arguments");

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] is " + args[i]);
		}
	}
}
