package pkg;

import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {
		
		int ar[][] =new int[3][2];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
	
	for(int v[]:ar)
	{
		for(int v1:v);
		{
			System.out.print(v1+ " ");
		}
	System.out.println();
	
	}
	}
}
