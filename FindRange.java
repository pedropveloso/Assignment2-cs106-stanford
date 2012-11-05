/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	/*This is the sentinel that stops the input*/
	private static final int sentinel = 0;
	
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int min = sentinel;
		int max = sentinel;
		while (true){
			int a = readInt ("? ");
			if (a>max) {
				max=a;
			}else if (a<min){
				min=a;
			}
			if (a==sentinel) break;
		}
		if (max==sentinel) {
			println("You must enter at least one number. Thank you.");
		} else if (min==sentinel) {
			println("smallest: " + max);
			println("largest: " + max);
		} else {
		println("smallest: " + min);
		println("largest: " + max);
		}
	}
}

