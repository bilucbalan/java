package pkg;



	interface Account {
	    void deposit(double amount);
	    void withdraw(double amount);
	    double getBalance();
	}


	class SavingsAccount implements Account {
	    private double balance;

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + " deposited successfully.");
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	
	class CurrentAccount implements Account {
	    private double balance;

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + " deposited successfully.");
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	public class Bankapp {
	
	    public static void main(String[] args) {
	       
	        Account savingsAccount = new SavingsAccount();
	        savingsAccount.deposit(1000);
	        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
	        savingsAccount.withdraw(500);
	        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

	       
	        Account currentAccount = new CurrentAccount();
	        currentAccount.deposit(2000);
	        System.out.println("Current Account Balance: " + currentAccount.getBalance());
	        currentAccount.withdraw(1500);
	        System.out.println("Current Account Balance: " + currentAccount.getBalance());
	    }
	
	

	}

