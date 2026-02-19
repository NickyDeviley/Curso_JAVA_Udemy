package HerancaPolimorfismo;

/*
	A classe é uma extensão da classe conta.
	E, para definir que ela não pode ser herdada,
	nós utilizamos a palavra chave FINAL. Que
	determina a classe como "não instanciável"
	
	A palavra-chave final tambem pode ser utilizada
	em métodos e variáveis.
	
	Nos métodos nós declaramos que eles não podem ser
	sobreescritos nas subclasses que instanciam a classe
	atual.
	
	Nas variáveis nós criamos uma constante, uma variável
	que não pode ter seu valor trocado. Então não é
	variável é constante.
*/

public final class ContaPoupanca extends Conta {

	private double interestRate;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	/*
		É uma boa prática de programação
		utilizar a anotação @Override
		ela ajuda outros programadores a identificar
		que o método está sendo sobreescrito,
		mas também ajuda o compilador a
		identificar o método sendo sobreescrito.
	*/
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getInterestRate() { return this.interestRate; }
	public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

}
