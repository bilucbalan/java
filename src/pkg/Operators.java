package pkg;

public class Operators {

	public static void main(String[] args) {
		int v1=10,v2=20;
		System.out.println("v1<v2");
		System.out.println("v1==v2");
		
	int a=20,b=30;
	int c=a;
	System.out.println("a+=b"+(a+=b));
		
	
	String username="abc";
	String pswd="abc123";
	System.out.println(username=="abc" && pswd=="abc123");
	System.out.println(username=="abc" && pswd=="abc23");
	System.out.println(username=="abc"|| pswd=="abc1");
	
	int z=5;
	System.out.println(z++);
	System.out.println(z);
	System.out.println(++z);
	
	int m=10,n=20;
	String s=m>n?"m is greater":"n is greater";
	System.out.println(s);
	
	
	
	
	
	}

}
