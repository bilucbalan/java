package oops;

import java.util.Scanner;
 interface bank
{
	public void accountdetails(String name);
	public void balance();
	public void withdrawl();
	public void deposit();
	
}
 class sbi implements bank
 {
	 String bankname="sbi";
	 int accountnumber;
	 int balance=5000;
	 Scanner sc=new Scanner(System.in);
	 @Override
	 public void accountdetails(String name) {
		  System.out.println("enter accountnumber");
		  accountnumber=sc.nextInt();
		  System.out.println("bank name="+bankname);
		  System.out.println("accountnumber"+accountnumber);
		  System.out.println("balance="+balance);
		  }
	 @Override
	 public void withdrawl()
	 {
		 System.out.println("withrawl amount");
		 int amount=sc.nextInt();
		 if(amount>balance)
		 {System.out.println("insufficient balance");
		 }
		 else
		 {balance =balance-amount;
		 System.out.println("balance="+balance);
		 }
	 }
	 @Override
	 public void deposit()
	 {
		 System.out.println("deposit amount");
		 int deposit=sc.nextInt();
		 balance =balance+deposit;
		 System.out.println("balance="+balance);
	 }
	 @Override
	 public void balance()
	 {
		 System.out.println("balance");
		 
		 
		 
		 }
	 }
	 

public class Bankaccount {

	public static void main(String[] args) {
		

	}

}
