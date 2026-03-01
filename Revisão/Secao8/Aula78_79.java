package Secao8;

import java.util.Locale;

public class Aula78_79 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		/*
		 	 Membros Estaticos (Static)
		 	 
		 	 Classes podem ser instanciadas para
		 	 reutiliar um certo código com valores diferentes.
		 	 Uma classe "Pessoa" pode ser instanciada em várias
		 	 pessoas diferentes, e o método "retornarCPF" funciona
		 	 com todas as pessoas e sempre retorna um CPF diferente.
		 	 
		 	 Quando usamos o Static nós impedimos que isso aconteça
		 	 transformamos o método ou variável referente a classe
		 	 e não mais à sua instancia. Ou seja, o método "retornarCPF"
		 	 agora causa um erro, pois o CPF só recebe valor depois que
		 	 um objeto pessoa é instanciado.
		 	 
		 	 Dentro de uma mesma classe, não podemos chamar um método
		 	 estático em um método não estático.
		 	 
		*/

		// EXEMPLO DE MEMBRO DE INSTANCIA
		Aula72_Triangulo t1 = new Aula72_Triangulo();
		t1.A = 10;
		t1.B = 2;
		t1.C = 30;
		
		// Para conseguir acessar o método de calcular Area, eu preciso
		// OBRIGATORIAMENTE ter um objeto instanciado e com valores atribuídos.
		t1.calcularArea();
		
		// EXEMPLO DE MEMBRO DE CLASSE
		// CHAMAMOS DIRETAMENTE PELA CLASSE
		Aula78_MemStatic.soma();
		
	}

}
