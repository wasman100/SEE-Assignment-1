/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while(frontIsClear()) {
		goUpColumn();
		goDownColumn();
		goToNextColumn();
		}
		goUpColumn();
	}

	private void goDownColumn() {
		// TODO Auto-generated method stub
		while(notFacingSouth()) {
			turnLeft();
		}
		while(frontIsClear()) {
			move();
		}
	}

	private void goToNextColumn() {
		// TODO Auto-generated method stub
		while(notFacingEast()) {
			turnLeft();
		}

		for(int i = 0; i < 4; i++) {
			if(frontIsClear()) {
			move();
				}
			}
		}
	

	private void goUpColumn() {
		// TODO Auto-generated method stub
		while(notFacingNorth()) {
			turnLeft();
		}
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
			move();

		}
		if(noBeepersPresent()) {
			putBeeper();
		}
	}

}
