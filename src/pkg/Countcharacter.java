package pkg;

public class Countcharacter {

	public static void main(String[] args) {

		String string = "hello world";    
        int count = 0;    
        for(int i = 0; i < string.length(); i++) 
        {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
        System.out.println("Total number of characters : " + count);  
	}

}
