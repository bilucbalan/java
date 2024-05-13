package pkg;

public class Arrayexample {

	public static void main(String[] args) {
		int arr[]=new int[] {85,26,78,91,42,7};
			int max = arr[0];
			for (int i=1;i< arr.length;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
					
				}
				}
			
System.out.println("largest element "+ max);
	}

}
