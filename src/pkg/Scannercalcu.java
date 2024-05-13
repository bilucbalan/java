package pkg;

import java.util.Scanner;

public class Scannercalcu {

	public static void main(String[] args) {
		int ch;
		do {
		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter your choices1.add 2.sub 3.mul 4.div");
		int ch1=sc.nextInt();


		switch(ch1)
		{
		case 1:System.out.println("addition");
		System.out.println("a+b");
		
		break;
		case 2:System.out.println("subtraction");
		System.out.println("a-b");
		break;
		case 3:System.out.println("multiplication");
		System.out.println("a*b");
		break;
		case 4:System.out.println("division");
		System.out.println("a/b");
		
		
		default:System.out.println("invalid choice");
		}
		{
		while (ch>0 && ch<=4);
		}
		

	}

}
