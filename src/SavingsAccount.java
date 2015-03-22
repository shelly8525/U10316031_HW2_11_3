
public class SavingsAccount extends Account{
	//create super constructor
	public SavingsAccount(int id, double blance) {
		super(id, blance);
	}
	public static void main(String[] args){
		//main method
		
	}
		//Inherit Account class method
		@Override
		public String toString(){
			 return "Savings Account: ID: " + getId()+ "Balance: " + getBlance() + "Rate: " + getAnnualInterestRate();
		}
}
