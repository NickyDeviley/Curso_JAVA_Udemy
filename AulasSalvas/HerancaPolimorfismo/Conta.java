package HerancaPolimorfismo;

public class Conta {

	private int number;
	private String holder;
	protected double balance;
	
	public Conta() {}
	
	public Conta(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void setNumber(int number) { this.number = number; }
	public void setHolder(String holder) { this.holder = holder; }
	public void setBalance(double balance) { this.balance = balance; }

	public int getNumber() { return number; }
	public double getBalance() { return balance; }
	public String getHolder() { return holder; }
	
}
