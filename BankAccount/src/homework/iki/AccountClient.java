package homework.iki;

public class AccountClient  {

	private String name ;
	private String password;
	private Account account;
	double transferCost = 4.75;
	
	public AccountClient(String name, String password, Account account) {
		
		this.name = name;
		this.password = password;
		this.account = account;
	
		
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}	

	public double withdrawal(int withdrawal) {
		if(account.balance > withdrawal){
		account.setBalance(account.balance-withdrawal);
		System.out.println("Güncel bakiyeniz: " + account.balance);
		}
		else {
			System.out.println("Bakiyeniz yetersiz!" );
		}
		return account.balance;
	
	}
	public double deposit(double deposit) {
		account.setBalance(account.balance + deposit);
		System.out.println("Güncel bakiyeniz: " + account.balance);
		return account.balance;
		
	}
	public double transfer(double transfer) {
		
		
		if(account.balance > transfer){
			
			account.setBalance(account.balance - transfer - transferCost);
			
			System.out.println("Güncel bakiyeniz: " + account.balance);
			}
			else {
				System.out.println("Bakiyeniz yetersiz!" );
			}
			return account.balance;
		
		
		
	}
	
	
	
    
}
