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
		int i = 0;
		while (true) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			} 
			if (n==1) break;
			i++;
		}
		println("The process took " + i + "to reach 1");
	}
}

