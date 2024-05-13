package pkg;

import java.util.Scanner;

public class Multiarrayexample {

	public static void main(String[] args) {
		
		int n,pos=0,neg=0,zero=0,i;
		int arr[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		n=sc.nextInt();
		System.out.println("Enter the elements in array..");
		for (i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]<0)
				neg++;
			else if(arr[i]==0)
				zero++;
			else
				pos++;
		}
		System.out.println("Positive Numbers: "+pos);
		System.out.println("Negative Numbers: "+neg);
		System.out.println("Zeros: "+zero);
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
