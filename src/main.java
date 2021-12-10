package towerOfHanoi;

import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input number of discs");
		Scanner userIn = new Scanner(System.in);
		int userStart = userIn.nextInt();
		
		towerSteps(userStart, 'A', 'B', 'C');
		
		while(userStart != 0) {
			System.out.println("Input number of discs");
			
			userStart = userIn.nextInt();
			if(userStart != 0) {
				towerSteps(userStart, 'A', 'B', 'C');
			}
			
		}
		
		
	}
	
	public static void towerSteps(int startDiscs, char start, char mid, char goal) {
		if(startDiscs == 1) {
			System.out.println(startDiscs +"->" + start + "->" + goal);
		}else {
			towerSteps(startDiscs - 1, start, goal, mid);
			System.out.println(startDiscs +"->" + start +"->" + goal);
			towerSteps(startDiscs - 1, mid, start, goal);
		}
	}

}
