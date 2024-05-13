package pkg;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		int n=0, m=1, sum=0;
		System.out.print(n+" "+m);
		for (int i=2;i<10;i++)
		{
			sum=n+m;
			System.out.print(" "+sum);
			n=m;
			m=sum;
		}
		

	}

}
