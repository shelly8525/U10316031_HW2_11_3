
public class SavingsAccount extends Account{
	public SavingsAccount(int id, double blance) {
		super(id, blance);
	}
	public static void main(String[] args){
		
	}
		@Override
		public String toString(){
			 return "Savings Account: ID: " + getId()+ "Balance: " + getBlance() + "Rate: " + getAnnualInterestRate();
		}
}
