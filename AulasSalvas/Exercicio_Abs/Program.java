package Exercicio_Abs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoasRegistradas;
		
		System.out.println("Quantas pessoas serão registradas?");
		int quant = sc.nextInt();
		pessoasRegistradas = new ArrayList<>(quant);
		
		for (Pessoa n : pessoasRegistradas) {
			
			System.out.println("É pessoa física ou Jurídica?\n\nPessoa Física(PF), Pessoa Juridica(PJ)");
			String pessoaTipo = sc.next();
			
			System.out.println("Qual o nome da pessoa?");
			String nome = sc.next();
			
			System.out.print("\n");
			
			System.out.println("Qual a renda Anual?");
			double rendaAnual = sc.nextDouble();
			
			System.out.print("\n");
			
			if (Pessoas.valueOf(pessoaTipo) == Pessoas.PF) {

				System.out.println("Quanto gastou com saúde?");
				double gastosSaude = sc.nextDouble();
				
				new PessoaFisica(nome, rendaAnual, gastosSaude);
				
			}
			else if (Pessoas.valueOf(pessoaTipo) == Pessoas.PJ) {
				
				System.out.println("Quantos funcionários tem?");
				int numeroDeFuncionarios = sc.nextInt();
				
				new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios);
			}
			
			System.out.println("\n\n");
			
		}
				
		sc.close();
		
	}
	
}
