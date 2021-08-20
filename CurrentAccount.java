package assessment;

public class CurrentAccount implements BankAccount{
	@Override
	public void CheckBankBalance(int b) {
		// TODO Auto-generated method stub
		b=b+100;
		System.out.println("Bank details from Current Account "+b+" rupees");
	}
	
	@Override
	public void validateUser(String user) {
		// TODO Auto-generated method stub
		if(user=="student")
			System.out.println("valid user from current bank account");
			else
				System.out.println("invalid user");
	}

}
