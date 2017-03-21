package RobotFactory;

import java.util.Random;

public class ManageRobot implements RobotFunctions {
	String str = "";
	

	public void giveName() {
		str+=this.randomLetters1();
		str+=this.randomLetters1();
		str+=this.randomNumber();
		System.out.println("I am "+str);
	}

	private char randomLetters1() {
		Random rand = new Random();
		int r = rand.nextInt(26) + 65;
		char ch = (char) r;
		return ch;

	}

	private int randomNumber() {
		Random rand = new Random();
		int r = rand.nextInt(1000) + 100;
		return r;

	}

	public void resetRobot() {
		str = "";
		System.out.println("I am "+str);
	}

	public void askName() {
		 giveName();

	}

}
