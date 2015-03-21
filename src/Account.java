public class Account {
	private int id = 0;
	private double blance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	public Account(int id,double blance){
		this.id = id;
		this.blance = blance;
	}
	
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
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setBlance(double blance){
		this.blance = blance;
	}
	
	public void setAnnualInterestRate(){
		this.annualInterestRate = annualInterestRate;
	}
	
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
		Account savingAccount = new Account(1122,20000);
		Account CheckAccount = new Account(1271,150);
		System.out.println("Accounts Created!");
		
	}
}
