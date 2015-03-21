
public class SavingsAccount extends Account{
	public static void main(String[] args){
		
	}
		@Override
		public String toString(){
			 return "Savings Account: ID: " + getId()+ "Balance: " + getBalance() + "Rate: " + getAnnualInterestRate();
		}
}
