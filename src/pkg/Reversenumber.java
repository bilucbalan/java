package pkg;

public class Reversenumber {

	public static void main(String[] args) {
		
		int n=2768;
		int temp=n;
		int rev=0,p;
	while(n>0)	
	{
		p=n%10;
		rev=rev*10+p;
		n=n/10;
	}
		System.out.println(rev);
		if(rev==temp)
		{
		System.out.println("palindrome");
		}
		else 
		{
		System.out.println("not palindrome");

}
}
}