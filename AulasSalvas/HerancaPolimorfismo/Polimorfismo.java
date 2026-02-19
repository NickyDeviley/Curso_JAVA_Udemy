package HerancaPolimorfismo;

public class Polimorfismo {

	public static void main(String[] args) {

		/*
			O polimorfismo é parecido com herança, 
			porém ele altera o sentido dos objetos.
			
			Exemplo:
			Nós criamos uma classe MONSTRO, ela tem 
			um método "Atacar", então nós criamos
			3 classes que herdam a classe MONSTRO, são elas:
			Orc, Goblin e Ogro.
			
			Quando nós declararmos o método atacar nós
			modificamos a sua funcionalidade.
			"Orc ataca com seu machado"
			"Goblin usa suas garras e dentes para te atacar"
			"O ogro esmaga o jogador"
		*/

		// Polimorfismo na prática:
		// Variáveis de um mesmo tipo que apontam
		// para objetos diferentes, portanto
		// agem de forma diferente quando chamados
		// métodos específicos.
		Conta x = new Conta();	
		Conta y = new ContaPoupanca();
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		// Aplicando com funcionários:
		
		Funcionario func1 = new Funcionario("Nicholas", 20, 200.0);
		Funcionario func2 = new FuncionarioTemp("Ricardo", 20, 200.0, 50.0);
		
		System.out.println("Pagamento do funcionario: " + func1.getName() + " " + func1.pagamento());
		System.out.println("Pagamento do funcionario: " + func2.getName() + " " + func2.pagamento());
		
	}

}
