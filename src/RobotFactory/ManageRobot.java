package RobotFactory;

import java.util.Random;

public class ManageRobot implements RobotFunctions {
	String str = "";
	

	public void giveName() {
		str+=this.randomLetters1();
		str+=this.randomLetters1();
		str+=this.randomNumber();
		
	}

	private char randomLetters1() {
		Random rand = new Random();
		int r = rand.nextInt(26) + 65;
		char ch = (char) r;
		return ch;

	}

	private int randomNumber() {
		Random rand = new Random();
		int r = rand.nextInt(900) + 100;
		return r;

	}

	public void resetRobot() {
		str = "";
		
	}

	public void askName() {
		 giveName();

	}

	public String getName() {
		return str;
	}

}
