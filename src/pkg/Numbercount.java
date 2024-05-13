package pkg;

public class Numbercount {
int evencount=0,oddcount=0;
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(i%2==0) 
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		
		System.out.println("evencount="+evencount);
		System.out.printn("oddcount="+oddcount);
		
		
		
	}

}
