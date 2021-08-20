package assessment;

public class SavingsAccount implements BankAccount{

	@Override
	public void CheckBankBalance(int b) {
		// TODO Auto-generated method stub
		b=b+100;
		System.out.println("Bank details from savings Account "+b+" rupees");
		
	}

	@Override
	public void validateUser(String user) {
		// TODO Auto-generated method stub
		if(user=="root")
		System.out.println("valid user from savings bank");
		else
			System.out.println("invalid user");
	}
	

}
