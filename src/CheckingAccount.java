
public class CheckingAccount extends Account{
	public static void main(String[] args){
		
	}
	@Override
	public String toString(){
		return "Checking Account: ID: " + getId() + "Balance: " + getBalance() + "Rate: " + getAnnualInterestRate();
	}
}
