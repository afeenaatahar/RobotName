package RobotFactory;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		RobotFunctions robot=new ManageRobot();
		System.out.println("Enter the action you want to:1-giveName  2-resetRobot  3-askName");
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("If you want to get name of robot press 1");
		a=sc.nextInt();
		if(a==1){
		robot.giveName();
		}
		System.out.println("If you want to reset robot press 2");
		a=sc.nextInt();
		if(a==2){
		robot.resetRobot();
		}
		System.out.println("If you want to ask new name for robot press 3");
		a=sc.nextInt();
		if( a==3){
		robot.askName();
		}
		
	}

}
