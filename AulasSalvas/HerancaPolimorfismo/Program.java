package HerancaPolimorfismo;

public class Program {

	public static void main(String[] args) {
		
		/*
			O que é herança?
			
			É um tipo de associação que permite que uma classe
			herde todos os dados e comportamentos de outra
			
			sintaxe:
			class a extends b {}
			
			A herança é uma associação entre classes não
			entre objetos. Ou seja, instanciar uma herança
			você cria apenas 1 único objeto, ao contrário
			de composição aonde você cria 2 objetos.
		*/

		Conta acc = new Conta(1001, "Nicholas", 0.0);
		ContaNegocios bacc = new ContaNegocios(1002, "Ricardo Paineis", 0.0, 500.0);

		// LowerCasting
		/*
		  	Estou atribuindo uma conta de negócios uma
		  	conta. Como todo objeto da classe filha também
		  	é um objeto da classe conta.
		  	
		  	Por isso esse código funciona.
		*/
		Conta acc1 = bacc;
		Conta acc2 = new ContaNegocios(1003, "bob", 0.0, 200.0);	// Aqui eu instancio um objeto da classe ContaNegocios e atribuo a um objeto conta
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);	// Aqui eu instancio um objeto da classe ContaPoupanca e atribuo a um objeto conta
		
		// DownCasting
		/*
			Esse código da um erro pois o objeto Conta
			é "menor" que o ContaNegocios, assim como a conversão
			de tipos primitivos em java.
			
			Um tipo maior não pode ser automaticamente convertido
			para um tipo menor, essa conversão deve ser feita manualmente.
			int -X-> short
			int ---> long
		*/
		//ContaNegocios acc4 = acc2;
		
		// Mesmo tipo de conversão usada em tipos primitivos
		// 
		// int vinte = 20;
		// short a = (short)vinte;
		ContaNegocios acc4 = (ContaNegocios)acc2;
		acc4.loan(100.0);
		
		/*
			O código abaixo ocorre um erro, pois os tipos
			são diferentes.
			O código dá erro em tempo de execução, ou seja
			somente após o programa ser executado.
		*/
		//ContaNegocios acc5 = (ContaNegocios)acc3;
		
		// Aqui nós confirmamos se o ACC3 é uma instância da classe ContaNegocios
		if (acc3 instanceof ContaNegocios) {
			ContaNegocios acc5 = (ContaNegocios)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		// Teste Sobreposição (Anotação Override)
		
		Conta acc6 = new Conta(1001, "Alex", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Conta acc7 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		/*
		 	Anotação Override explicada na classe
		 	ContaPoupanca.
		 	
		 	A palavra super explicada na classe
		 	ContaNegocios
		*/
	}

}
