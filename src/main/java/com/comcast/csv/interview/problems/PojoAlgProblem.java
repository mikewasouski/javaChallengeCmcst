package com.comcast.csv.interview.problems;

import java.awt.Rectangle;

/**
 * Using absolute coordinates for EVERYTHING, implement the following methods to
 * position the inner rectangle relative to the outer rectangle.
 */
public class PojoAlgProblem {

	/**
	 * Put the inner rectangle so that it's bottom right corner aligns with the
	 * bottom right corner of the outer rectangle.
	 * 
	 * @param inner
	 *            the inner rectangle to position
	 * @param outer
	 *            the outer rectangle to use as a reference
	 */
	public void bottomRight(Rectangle inner, Rectangle outer) {
		Double xD = outer.x+outer.getWidth()-inner.getWidth();
		Double yD = outer.y+outer.getHeight()-inner.getHeight();

		inner.setLocation( xD.intValue(), yD.intValue()  );
		
		/*
		-------------
		|			|
		|			|
		|			|
		|    --------
		|	 |		|
		|    |		|
		-------------
		 */
	}

	/**
	 * Put the inner rectangle so that it is centered vertically and
	 * horizontally
	 * 
	 * @param inner
	 *            the inner rectangle to position
	 * @param outer
	 *            the outer rectangle to use as a reference
	 */
	public void middleCenter(Rectangle inner, Rectangle outer) {
		
		Double xD = (outer.getWidth()-inner.getWidth())/2+inner.x;
		Double yD = (outer.getHeight()-inner.getHeight())/2+inner.y;
		
		inner.setLocation( xD.intValue(), yD.intValue()  );
		
	}
}
