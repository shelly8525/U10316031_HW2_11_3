import java.util.ArrayList;
import java.util.Date;

public class Account {
	//four variables
	private static String name;
	private int id = 0;
	private static double blance = 0;
	private static double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	static ArrayList<Transaction> list = new ArrayList<Transaction>();
	
	//the constructor
	public Account(int id,double blance,String name){
		Account.name = name;
		this.id = id;
		Account.blance = blance;
	}
	//the accessor method
	public int getId(){
		return id;
	}
	
	public double getBlance(){
		return blance;
	}
	
	public static double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public ArrayList<Transaction> getList() {
	    return list;
	 }
	
	public String getName() {
		return name;
	}
	
	//the mutation method
	public void setId(int id){
		this.id = id;
	}
	
	public void setBlance(double blance){
		Account.blance = blance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		Account.annualInterestRate = annualInterestRate;
	}
	
	public void setName(String name) {
		Account.name = name;
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
		Account Account1 = new Account(1122, 1000,"George");
		
		Account1.withdraw(30);
		Account1.withdraw(40);
		Account1.withdraw(50);
		
		Account1.deposit(2);
		Account1.deposit(4);
		Account1.deposit(5);
		
		 Account1.setAnnualInterestRate(1.5);
		
		 System.out.println("Name: " + Account1.getName());
		 System.out.println("Annual interest rate: " + Account1.getAnnualInterestRate());
		 System.out.println("Balance: " + Account1.getBlance());
		
		for(int i = 0;i < list.size();i++){
		      System.out.printf("%-35s%-15s%-15s%-15s\n",  Account1.list.getDate(),  Account1.list.getType(),  Account1.list.getAmount(),  Account1.list.getBalance());
		}
	}
	
	
}
