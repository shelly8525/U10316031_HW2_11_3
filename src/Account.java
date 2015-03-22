public class Account {
	//four variables
	private int id = 0;
	private double blance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	//the constructor
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
		SavingsAccount savingsAccount1 = new SavingsAccount(1122,20000);
		CheckingAccount checkingAccount1 = new CheckingAccount(1271,150);
		System.out.println("Accounts Created!");
		System.out.println(savingsAccount1.toString());
		System.out.println(checkingAccount1.toString());
		savingsAccount1.setAnnualInterestRate(4.5);
		checkingAccount1.setAnnualInterestRate(1.25);
		System.out.println("Updating Interest");
		System.out.println(savingsAccount1.toString());
	    System.out.println(checkingAccount1.toString());
	    savingsAccount1.withdraw(5000);
	    checkingAccount1.withdraw(300);
	    System.out.println("Processing Withdraw");
	    System.out.println(savingsAccount1.toString());
	    System.out.println(checkingAccount1.toString());
	    savingsAccount1.deposit(10000);
	    checkingAccount1.deposit(500);
	    System.out.println("Processing Deposit");
	    System.out.println(savingsAccount1.toString());
	    System.out.println(checkingAccount1.toString());
	    System.out.println("Thank you for your business!");
	}
}
