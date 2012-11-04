
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class target2 extends GraphicsProgram {


/** Width of each brick in pixels */
private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
private static final int BRICKS_IN_BASE = 14;
int brickNumber = BRICKS_IN_BASE;
int yRow = 0;
int xRow = 0;

	public void run() {
		while (brickNumber != 0) {
			layRow();
			brickNumber-=1;
			}
	}

	private void layRow() {
		findPosition();
		laybricks();
		
	}

	private void laybricks() {
		// laybricks in a row
		int xBrick = xRow;
		int yBrick = yRow;
		for (int i = 1; i < (brickNumber + 1); i++) {
			add (new GRect (xBrick, yBrick, BRICK_WIDTH, BRICK_HEIGHT));
			xBrick += BRICK_WIDTH;
		}
	}

	public void findPosition() {
		// find out where the first brick of the row should be placed
		findX();
		findY();
	}

	public void findY() {
		// find the y position for the first brick of the row
		int rowNumber = 1 + BRICKS_IN_BASE - brickNumber;
		int yRow = getHeight() - (rowNumber * BRICK_HEIGHT);
	}

	public void findX() {
		// find the x position for the first brick of the row
		int rowWidth = brickNumber * BRICK_WIDTH;
		int xRow = (getWidth() - rowWidth) / 2;
	}
}


