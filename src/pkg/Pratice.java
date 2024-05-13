package pkg;

public class Pratice {

	public static void main(String[] args) {
	
		int a=20,b=30,temp;
		System.out.println("before swapping value of a="+a +"value of b="+b);	
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping value of a="+a +"value of b="+b);	
		
		
		int c=40,d=20;
		System.out.println("before swapping value of c="+c +"value of d="+d);
		c=c-d;
		d=c+d;
		System.out.println("after swapping value of c="+c +"value ofd="+d);	

		
		int f=18;
		System.out.println(f%10);	
		
		int z=3,y=5,x=7;
		if(z>y && z>x)
		{
			System.out.println("z is greater");		}
			
		else if (y>x && y>z)
		{

			System.out.println("y is greater");
		}
		else
		{

			System.out.println("x is greater");
		}
		
		int age=24,weight=65;
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("not eligible : underweight");
			}
		}
		else
		{
			System.out.println("not eligible : underage");
		}
			
	
	}

}
