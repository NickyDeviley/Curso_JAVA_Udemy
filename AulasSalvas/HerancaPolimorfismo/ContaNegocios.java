package HerancaPolimorfismo;

public class ContaNegocios extends Conta {	

	/*
	 	Essa classe EXTENDE a classe conta,
	 	ela é filha da classe conta
	*/

	// Variável que só existe para contas de negócios
	private double loanLimit;
	
	// Construtor padrão
	public ContaNegocios() {}

	// Construtor que chama o construtor da classe pai para criar
	// Uma conta de negócios que EXTENDE a classe conta
	public ContaNegocios(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			deposit(amount);	
		}
		
	}
	
	/*
		Método sendo sobreescrito
		utilizando a palavra chave super.
	*/
	@Override
	public void withdraw(double amount) {
		// A palavra super serve para chamar a super classe (Classe pai)
		// ela é utilizada nas instâncias para reutilizar os métodos que já esta
		// escrito na superclasse.
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	public double getLoanLimit() { return loanLimit; }
	public void setLoanLimit(double loanLimit) { this.loanLimit = loanLimit; }
	
	
	
}
