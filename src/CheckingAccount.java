
public class CheckingAccount extends Account{
	public CheckingAccount(int id, double blance) {
		super(id, blance);
	}
	public static void main(String[] args){
		
	}
	@Override
	public String toString(){
		return "Checking Account: ID: " + getId() + "Balance: " + getBlance() + "Rate: " + getAnnualInterestRate();
	}
}
