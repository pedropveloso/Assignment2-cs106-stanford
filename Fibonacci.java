import acm.program.*;

public class Fibonacci extends ConsoleProgram{
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int t1 = 0;
		int t2 = 1;
		while (t1<10000) {
			int t3 = t1+t2;
			println(t1);
			t2=t1;
			t2=t3;
			
		}
		
	}

}
