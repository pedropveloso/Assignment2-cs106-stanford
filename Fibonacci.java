import acm.program.*;

public class Fibonacci extends ConsoleProgram{
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int x = 0;
		int y=0;
		while (x <10000) {
			println(x);
			if (x==0) {
				x++;
			}else{
				x+=y;
			}
			y=x;

			
		}
		
	}

}
