package Secao5;

// AULA 41 - SEÇÃO 5
public class Aula41 {

	public static void main(String[] args) {

		/*
		  	Expressões lógicas:
		  	
		  	&& = E
		  	|| = OU
		  	
		*/
		
		boolean a = true;
		
		a = 10 > 0 && 10 != 3;		// True
		a = 10 > 11 && 10 != 3;		// False
		a = 10 > 11 && 10 != 10;	// False
		
		a = 10 > 0 || 10 != 3;		// true
		a = 10 > 11 || 10 != 3;		// true
		a = 10 > 11 || 10 != 10;	// false
	}

}
