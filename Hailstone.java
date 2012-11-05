/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int n = readInt ("Enter a number: ");
		int i = 1;
		while (true) {
			if (n % 2 == 0) {
				int a = n / 2;
				println(n + " is even, so I take half: " + a);
				n /= 2;
			} else {
				int b = n * 3 + 1;
				println(n + " is odd, so I make 3n + 1: " + b);
				n = n * 3 + 1;
			} 
			if (n==1) break;
			i++;
		}
		println("The process took " + i + " to reach 1");
	}
}

