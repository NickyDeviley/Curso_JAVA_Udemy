package Secao8;

// AULA 72, 73  - SEÇÃO 8
public class Aula72_73 {
	public static void main(String[] args) {

		// PROGRAMAÇÃO ORIENTADA A OBJETO
		
		// DECLARANDO UM OBJETO
		Aula72_Triangulo triangle = new Aula72_Triangulo();
		
		// ATRIBUINDO VALORES AS VARIÁVEIS PÚBLICAS
		triangle.A = 20;
		triangle.B = 10;
		triangle.C = 15;
		
		// RECEBENDO A AREA DO RETÂNGULO
		double area = triangle.calcularArea();
		
		// IMPRIMINDO A AREA
		System.out.printf("Area do retângulo: %.2f", area);
		
	}
}
