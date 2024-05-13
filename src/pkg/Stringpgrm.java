package pkg;

public class Stringpgrm {

	public static void main(String[] args) {
		
		//concat
		
		String s="hello welcome to world";
		String s1="welcome";
		
		String s2="Hello";
		
		System.out.println(s.concat(s1));
		System.out.println(3+1+s+9+3);
		
		//equals
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//contains
		System.out.println(s.contains("world"));
		
		//touppercase and tolowercase
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//startswith and endswith
		System.out.println(s.startsWith("hello"));
		System.out.println(s.endsWith("world"));
		
		//split
		String[] str=s.split(" ");
		for(String v:str)
		{
			System.out.println(v);
			
		}
		
		//tochaarray
		char[] ch=s1.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
