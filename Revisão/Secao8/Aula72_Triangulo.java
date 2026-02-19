package Secao8;

public class Aula72_Triangulo {

	// Lados do Triangulo
	public double A;
	public double B;
	public double C;
	
	// Métodos
	public double calcularArea() {
		
		double valor1, resultado;
		
		valor1 = (A + B + C) / 2.0;
		
		resultado = Math.sqrt(valor1 * (valor1 - A) * (valor1 - B) * (valor1 - C));
		
		return resultado;
		
	}
}
