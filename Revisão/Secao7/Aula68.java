package Secao7;

// AULA 68 - SEÇÃO 7
public class Aula68 {
	public static void main(String[] args) {

		// Funções/Métodos são pedaços de código
		// que podem ser separados e chamados quando
		// necessário, assim não é necessário reescrever
		// aquele código
		
		imprimirOlaMundo();
		int resultado = somarDoisValores(10, 20);
		
	}
	
	public static void imprimirOlaMundo() {
		
		System.out.println("Olá, mundo!");
		
	}
	
	public static int somarDoisValores(int a, int b) {
		
		return a + b;
		
	}
}
