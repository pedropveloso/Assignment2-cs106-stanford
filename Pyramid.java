/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		int brickNumber = BRICKS_IN_BASE;
		//while (true) {
			int rowWidth = brickNumber * BRICK_WIDTH;
			int xRow = (getWidth() - rowWidth) / 2;
			int rowNumber = 1 + BRICKS_IN_BASE - brickNumber;
			int yRow = getHeight() - (rowNumber * BRICK_HEIGHT);
			int xBrick = xRow;
			int yBrick = yRow;
			//for (int i = 1; i < (brickNumber + 1); i++) {
				add (new GRect (xBrick, yBrick, BRICK_WIDTH, BRICK_HEIGHT));
				//xBrick += BRICK_WIDTH;
			//}
			//if (brickNumber == 0) break;
			//brickNumber-=1;
		//}
	}


}

