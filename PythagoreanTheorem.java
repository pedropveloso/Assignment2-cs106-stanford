/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute the Pythagorean theorem.");
		int a = readInt ("Enter a: ");
		int b = readInt ("Enter b: ");
		int y = a * a + b * b;
		double c = Math.sqrt(y);
		println("c = " + c);
	}
}
