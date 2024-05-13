package pkg;

public class Arrayduplicate {

	public static void main(String[] args) {
		
		
        int [] arr = new int [] {1,5,3,9,4,2,7,8,8,3,5,7};  
        
        System.out.println("Duplicate elements = ");  
        
        for(int i = 0; i < arr.length; i++)
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

        
        
        
        
       int rows = 6;
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
	}

}
