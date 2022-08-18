package homework.iki;

public class AccountTest {

	public static void main(String[] args) {
		 Account account1 = new Account(700000);
		
		
		AccountClient client1 = new AccountClient("rg", "rg", account1);
		
		
		
		client1.deposit(23.6);
		client1.transfer(20000);
		client1.withdrawal(900);
			
	 
	}

}























//client1.setName("");
//client1.setPassword("1290");
//client2.setName("");
//client2.setPassword("1234");

//client1.setBalance(150.0);
//client2.setBalance(1500.0);
