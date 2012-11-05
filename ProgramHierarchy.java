/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	/*Width of the class boxes*/
	private static final int BOX_WIDTH = 200;
	
	/*Height of the class box*/
	private static final int BOX_HEIGHT = 75;
	
	/*Y size of the connecting lines*/
	private static final int LINE_SIZE = 50;
	
	/*Distance between boxes in the bottom row*/
	private static final int DISTANCE_BOXES = 30;
	
	public void run() {
		double xProgramBox = (double) (getWidth()-BOX_WIDTH) / 2;
		double yProgramBox = (double) (getHeight() - (2 * BOX_HEIGHT + LINE_SIZE)) / 2;
		double xGraphicsProgramBox = (double) (getWidth() - (3 * BOX_WIDTH + 2 * DISTANCE_BOXES)) / 2;
		double yBottomRow = yProgramBox + BOX_HEIGHT + LINE_SIZE;
		double xDialogueProgramBox = xGraphicsProgramBox + 2 * BOX_WIDTH + 2 * DISTANCE_BOXES;
		GRect programBox = new GRect (xProgramBox, yProgramBox, BOX_WIDTH, BOX_HEIGHT);
		GRect graphicsProgramBox = new GRect (xGraphicsProgramBox, yBottomRow, BOX_WIDTH, BOX_HEIGHT);
		GRect consoleProgramBox = new GRect (xProgramBox, yBottomRow, BOX_WIDTH, BOX_HEIGHT);
		GRect dialogProgramBox = new GRect (xDialogueProgramBox, yBottomRow, BOX_WIDTH, BOX_HEIGHT);
		GLabel program = new GLabel ("Program", 0, 0);
		double dxProgram = xProgramBox + (BOX_WIDTH - program.getWidth()) / 2;
		double dyProgram = yProgramBox + (BOX_HEIGHT + program.getHeight() / 2 ) / 2;
		program.move(dxProgram, dyProgram);
		GLabel graphicsProgram = new GLabel ("GraphicsProgram", 0, 0);
		double dxGraphicsProgram = xGraphicsProgramBox + (BOX_WIDTH - graphicsProgram.getWidth()) / 2;
		double dyGraphicsProgram = yBottomRow + (BOX_HEIGHT + graphicsProgram.getHeight() / 2 ) / 2;
		graphicsProgram.move(dxGraphicsProgram, dyGraphicsProgram);
		GLabel consoleProgram = new GLabel ("ConsoleProgram", 0, 0);
		double dxConsoleProgram = xProgramBox + (BOX_WIDTH - consoleProgram.getWidth()) / 2;
		double dyConsoleProgram = yBottomRow + (BOX_HEIGHT + consoleProgram.getHeight() / 2 ) / 2;
		consoleProgram.move(dxConsoleProgram, dyConsoleProgram);
		GLabel dialogueProgram = new GLabel ("DialogueProgram", 0, 0);
		double dxDialogueProgram = xDialogueProgramBox + (BOX_WIDTH - dialogueProgram.getWidth()) / 2;
		double dyDialogueProgram = yBottomRow + (BOX_HEIGHT + dialogueProgram.getHeight() / 2 ) / 2;
		dialogueProgram.move(dxDialogueProgram, dyDialogueProgram);
		double x1 = xProgramBox + BOX_WIDTH / 2;
		double y1 = yProgramBox + BOX_HEIGHT;
		double x2 = xGraphicsProgramBox + BOX_WIDTH / 2;
		double y2 = yBottomRow;
		double x3 = x1;
		double y3 = y2;
		double x4 = xDialogueProgramBox + BOX_WIDTH / 2;
		double y4 = y2;
		GLine line1 = new GLine (x1, y1, x2, y2);
		GLine line2 = new GLine (x1, y1, x3, y3);
		GLine line3 = new GLine (x1, y1, x4, y4);
		add (programBox);
		add (graphicsProgramBox);
		add (consoleProgramBox);
		add (dialogProgramBox);
		add (program);
		add (graphicsProgram);
		add (consoleProgram);
		add (dialogueProgram);
		add (line1);
		add (line2);
		add (line3);
		
	}
}

