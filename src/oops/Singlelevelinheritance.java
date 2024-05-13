package oops;

class Parent
{
	public void job()
	{
		System.out.println("job details");
	}
}


class Child extends Parent
{
	public void childmethod()
	{
		System.out.println("child details");
		
	}
}




public class Singlelevelinheritance {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.childmethod();
		ob.job();
	

	}

}
