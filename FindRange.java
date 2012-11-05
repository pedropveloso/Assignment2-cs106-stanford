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
		int min = 0;
		int max = 0;
		while (true){
			int a = readInt ("? ");
			if (a>max) {
				max=a;
			}else if (a<min){
				min=a;
			}
			if (a==sentinel) break;
		}
		println("smallest: " + min);
		println("largest: " + max);
	}
}

