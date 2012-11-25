import acm.program.*;

/*
 * This program lists the terms in the Fibonacci sequence up
 * to a constant called MAX_TERM, which indicates a limit
 * above which the terms in the Fibonacci sequence are not shown.
 */

public class Fibonacci extends ConsoleProgram {
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int t1 = 0;
		int t2 = 1;
		while (t1 < MAX_TERM) {
			int t3 = t1+t2;
			println(t1);
			t1=t2;
			t2=t3;
		}
	}

/* Defines the largest term to be displayed */
	private static final int MAX_TERM = 10000;
	
}
