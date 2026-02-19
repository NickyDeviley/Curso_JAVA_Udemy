package Basicos;

public class ExpressoesAr {

	public static void main(String[] args) {
		
		int dez = 10;
		int vinte  = 20;
		int vinteum = 21;
		int x = 0;
		
		x = dez + vinte;		// Soma
		
		System.out.printf("A soma de: %d + %d é igual a: %d", dez, vinte, x);
		System.out.println("\n");
		
		x = dez - vinte;		// Subtração
		
		System.out.printf("A subtração de: %d - %d é igual a: %d", dez, vinte, x);
		System.out.println("\n");
		
		x = dez * vinte;		// Multiplicação
		
		System.out.printf("A multiplicação de: %d * %d é igual a: %d", dez, vinte, x);
		System.out.println("\n");
		
		x = dez / vinte;		// Divisão
		
		System.out.printf("A divisão de: %d / %d é igual a: %d", dez, vinte, x);
		System.out.println("\n");
		
		x = vinteum % dez;		// Resto
		
		System.out.print("O resto de: " + vinteum + " % " + dez + " é igual a: " + x);
		System.out.println("\n");
		
		
	}
	
}
