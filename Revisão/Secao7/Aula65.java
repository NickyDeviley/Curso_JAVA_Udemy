package Secao7;

// AULA 65 - SEÇÃO 7
public class Aula65 {
	public static void main(String[] args) {

		/*
		 	Operadores BitWise
		 	
		 	&, |, ^
		 	
		 	Funcionam da mesma forma que os
		 	operadores lógicos, porém possuí
		 	o "OU-exclusivo", que só retorna
		 	verdadeiro quando APENAS uma das
		 	condições for verdadeira.
		 	
		 	Eles trabalham através dos bits de
		 	cada número, então:
		 	
		 	Equivalente em binário:
		 	(89) 0101 1001
		 	(60) 0011 1100
		 	
		 	Operador & só retorna verdadeiro
		 	quando ambos os valores são 1:
		 	
		 	0101 1001 -\
		 				> fffv vfff = 0001 1000 (24)
		 	0011 1100 -/
		 	
		 	
		 	Operador | retorna verdadeiro se 
		 	um dos valores for 1:
		 	
		 	0101 1001 -\
		 				> fvvv vvfv = 1000 1101 (125)
		 	0011 1100 -/
		 	
		 	
		 	Operador ^ só retorna verdadeiro se
		 	APENAS um dos valores for 1:
		
			0101 1001 -\
		 				> fvvf fvfv = 0110 1010 (101) 
		 	0011 1100 -/
		 	
		*/
		
		int a = 89 & 60;	// 24
		int b = 89 | 60;	// 125
		int c = 89 ^ 60;	// 101
		
	}
}
