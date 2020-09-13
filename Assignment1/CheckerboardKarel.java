/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		int row = 1;
		int height = 1;

		while (frontIsClear()) {
			move();
			row++;
		}
		while (notFacingNorth()) {
			turnLeft();
		}
		while (frontIsClear()) {
			move();
			height++;
		}

		IfStatementsFun(row, height);

	}

	private void IfStatementsFun(int row, int height) {
		// TODO Auto-generated method stub

		if (row == 1) {
			FaceSouthBeepers();
		} else if (row % 2 == 1) {
			for (int i = 1; i <= row; i += 2) {

				evenRowRun(1, false);
				if (i <= height - 2) {

					oddRowRun(0, true);

				}

			}
		} else {

			for (int i = 0; i < height; i += 2) {
				evenRowRun(0, false);
				if (i <= height - 2) {
					oddRowRun(0, false);

				}

			}
		}
	}

	private void FaceSouthBeepers() {
		// TODO Auto-generated method stub
		int i = 0;
		while (notFacingSouth()) {
			turnLeft();
		}
		while (frontIsClear()) {
			if (i % 2 == 1) {
				putBeeper();
			}
			move();
			i++;
		}

	}

	private void evenRowRun(int i, boolean hahah) {
		// TODO Auto-generated method stub

		while (notFacingWest()) {
			turnLeft();
		}

		BeepersPlacer(i, hahah);
		FaceSouth(i);

	}

	private void oddRowRun(int i, boolean hahah) {
		// TODO Auto-generated method stub

		while (notFacingEast()) {
			turnLeft();
		}

		BeepersPlacer(i, hahah);
		FaceSouth(i);

	}

	private void FaceSouth(int i) {
		while (notFacingSouth()) {
			turnLeft();
		}

		if (frontIsClear()) {
			move();
		}
	}

	private void BeepersPlacer(int i, boolean check) {
		// TODO Auto-generated method stub

		while (frontIsClear()) {
			if (i % 2 == 0) {
				putBeeper();
			}
			move();
			i++;

		}
		if (check == true) {
			putBeeper();
		}
	}

}
