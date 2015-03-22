public class Account {
	//four variables
	private int id = 0;
	private double blance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	//the constrc]uctor
	public Account(int id,double blance){
		this.id = id;
		this.blance = blance;
	}
	//the accessor method
	public int getId(){
		return id;
	}
	
	public double getBlance(){
		return blance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	//the mutation method
	public void setId(int id){
		this.id = id;
	}
	
	public void setBlance(double blance){
		this.blance = blance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	//the method
	public double getMonthlyInterestRate(){
		return annualInterestRate/12/100;
	}
	
	public double getMonthlyInterest(){
		return blance*(annualInterestRate/12/100);
	}
	
	public double withdraw(double withdraw1){	
		return blance -= withdraw1;
	}
	
	public double deposit(double deposit1){	
		return blance += deposit1;
	}
	
	public static void main(String[] args){
		//main method test object
		Account savingsAccount = new Account(1122,20000);
		Account checkingAccount = new Account(1271,150);
		System.out.println("Accounts Created!");
		System.out.println(savingsAccount);
		System.out.println(checkingAccount);
		savingsAccount.setAnnualInterestRate(4.5);
		checkingAccount.setAnnualInterestRate(1.25);
		System.out.println("Updating Interest");
		System.out.println(savingsAccount);
	    System.out.println(checkingAccount);
	    savingsAccount.withdraw(5000);
	    checkingAccount.withdraw(300);
	    System.out.println("Processing Withdraw");
	    System.out.println(savingsAccount);
	    System.out.println(checkingAccount);
	    savingsAccount.deposit(10000);
	    checkingAccount.deposit(500);
	    System.out.println("Processing Deposit");
	    System.out.println(savingsAccount);
	    System.out.println(checkingAccount);
	    System.out.println("Thank you for your business!");
	}
}
