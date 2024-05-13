package pkg;

public class Stringexp1 {

	public static void main(String[] args) {
		
		
		String s="Testing Training center";
		
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--)
		{
		System.out.println(st[i]);
		}
	}

}
