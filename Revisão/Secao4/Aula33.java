package Secao4;

import java.util.Scanner;

// AULA 33 | 34 - SEÇÃO 4
public class Aula33 {
	public static void main(String[] args) {

		// Entrada de Dados:
		Scanner sc = new Scanner(System.in);
		
		// Recebendo a entrada:
		System.out.println("Digite um valor!");
		int valor = sc.nextInt();
		
		// Imprimindo a entrada:
		System.out.printf("Valor Digitado: %d", valor);
		
		
		// Para evitar entradas vazias:
		sc.nextLine();
		
		
		// Para ler linhas de texto até a quebra de linha:
		String frase = sc.nextLine();
		System.out.println(frase);
		
		
		// Ler até o primeiro espaço:
		String frase1 = sc.next();
		
		
		// Deletando o objeto sc
		sc.close();
		
	}
}
