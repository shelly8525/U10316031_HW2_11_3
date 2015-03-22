
public class CheckingAccount extends Account{
	//create super constructor
	public CheckingAccount(int id, double blance) {
		super(id, blance);
	}
	public static void main(String[] args){
		//main method
	}
	//Inherit Account class method
	@Override
	public String toString(){
		return "Checking Account: ID: " + getId() + "Balance: " + getBlance() + "Rate: " + getAnnualInterestRate();
	}
}
