package Fundamentals;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========NUMBER GUSSING GAME=============");
		double num;
		double a = Math.floor(Math.random()*100);
		for(int i=10;i>=0;i--) {
			System.out.println("Guess the number between 1 to 100");
			num = sc.nextDouble();
			if(num == a) {
				System.out.println("Yeah!!!!!!!");
				break;
			}else if(num > a) {
				System.out.println("too high");
			}else if(num < a) {
				System.out.println("Too low");
			}else {
				System.out.println("anything is wrong");
			}
			System.out.println("Only "+ i +" attempt is left . " );
			if(i == 0) {
				System.out.print("Ooops! you lose");
			}
		}
	sc.close();	
	}
}
