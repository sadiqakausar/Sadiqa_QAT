package assessment;

public class MainMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new SavingsAccount();
		b.CheckBankBalance(10);
		b.validateUser("root");
		b.validateUser("abc");
		System.out.println();
		
		BankAccount c=new CurrentAccount();
		c.CheckBankBalance(20);
		c.validateUser("student");
		c.validateUser("root");

	}

}
