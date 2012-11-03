/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Target extends GraphicsProgram {
	
	/** Radius of the outer circle in pixels*/
	private static final double OUTER_CIRCLE_RADIUS = 72.0;
	
	/** Radius of the white circle in pixels*/
	private static final double MIDDLE_CIRCLE_RADIUS = (0.65 * 72);

	/** Radius of the inner circle in pixels*/
	private static final double INNER_CIRCLE_RADIUS = (0.3 * 72);
	
	
	public void run() {
		double outerCircleDiameter = 2 * OUTER_CIRCLE_RADIUS;
		double middleCircleDiameter = 2 * MIDDLE_CIRCLE_RADIUS;
		double innerCircleDiameter = 2 * INNER_CIRCLE_RADIUS;
		double xOuterCircle = (getWidth() - outerCircleDiameter) / 2;
		double xMiddleCircle = (getWidth() - middleCircleDiameter) / 2;
		double xInnerCircle = (getWidth() - innerCircleDiameter) / 2;
		double yOuterCircle = (getHeight() - outerCircleDiameter) / 2;
		double yMiddleCircle = (getHeight() - middleCircleDiameter) / 2;
		double yInnerCircle = (getHeight() - innerCircleDiameter) / 2;
		GOval outCircle = new GOval(xOuterCircle,yOuterCircle,outerCircleDiameter,outerCircleDiameter);
		GOval middleCircle = new GOval(xMiddleCircle,yMiddleCircle,middleCircleDiameter,middleCircleDiameter);
		GOval centreCircle = new GOval(xInnerCircle,yInnerCircle,innerCircleDiameter,innerCircleDiameter);
		outCircle.setColor(Color.RED);
		middleCircle.setColor(Color.WHITE);
		centreCircle.setColor(Color.RED);
		outCircle.setFilled(true);
		middleCircle.setFilled(true);
		centreCircle.setFilled(true);
		outCircle.setFillColor(Color.RED);
		middleCircle.setFillColor(Color.WHITE);
		centreCircle.setFillColor(Color.RED);
		add (outCircle);
		add (middleCircle);
		add (centreCircle);
	}
}
