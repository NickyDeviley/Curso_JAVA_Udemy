package Enumeradores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Objeto obj = new Objeto(Enumerador.sabado, 10, "Nicholas");

		System.out.println(obj.getDia_semana());
		
		System.out.println("\n\n\n");
		
		Scanner sc = new Scanner(System.in);
		
		String dia = sc.next();
		
		Enumerador diadia = Enumerador.valueOf(dia);
		
		System.out.println(diadia);
		
	}

}
