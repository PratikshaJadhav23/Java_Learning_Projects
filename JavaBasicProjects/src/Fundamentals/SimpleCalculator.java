package Fundamentals;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, a,b ,c ;
		System.out.println("===========SIMPLE CALCULATOR==============");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Square");
		System.out.println("6.Cube");
		System.out.println("7.Average");
		System.out.println("8.Power");
		System.out.println("Enter your choice");
		ch = sc.nextInt();
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b = sc.nextInt();
		switch(ch) 
		{
		case 1:
			c = a + b;
			System.out.println("Answer is "+ c);
			break;
		case 2:
		    c = a - b;
		    System.out.println("Answer is "+ c);
			break;
		case 3:
			c= a * b;
			System.out.println("Answer is "+ c);
			break;
		case 4:
			c = a / b;
			System.out.println("Answer is "+ c);
			break;
		case 5:
			c = a * a;
			System.out.println("Answer is "+ c);
			break;
		case 6:
			c= a * a * a;
			System.out.println("Answer is "+ c);
			break;
		case 7 :
			c= (a + b)/2;
			System.out.println("Answer is "+ c);
			break;	
		default:
				System.out.print("Invalid Input");
		}
		sc.close();
	}

}
