import java.util,Scanner;

public class Account {
	private int id = 0;
	private double blance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	input Scanner = new input(System.in);
	
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
	
	public double withdraw(){
		
	}
}
