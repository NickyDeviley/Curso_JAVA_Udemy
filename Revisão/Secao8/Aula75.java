package Secao8;

public class Aula75 {
	public static void main(String[] args) {
		
		/*
		 	Classe Object e ToString
		 	
		 	Toda classe em java é uma subclasse
		 	da classe OBJECT, e esta super classe
		 	possuí métodos próprios:
		 	
		 	getClass	- Retorna o tipo de Objeto
		 	Equals		- Compara se dois objetos são iguais
		 	hashCode	- Retorna um código hash do objeto
		 	toString	- Converte o objeto para string
		*/
		
		// CRIANDO OBJETO PARA TESTE
		Aula72_Triangulo tri1 = new Aula72_Triangulo();
		tri1.A = 10;
		tri1.B = 20;
		tri1.C = 30;
		
		// Vai imprimir o local na memória, pois não definimos o que o toString deve retonar
		// Mas como nós definimos ele retorna o que foi detalhado
		tri1.toString();	
		
		// O toString é implícitamente chamado quando escrevemos esse código
		System.out.println(tri1);

	}
}
