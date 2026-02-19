package Abstracao;

public class HerdaClasse extends AbstrataClasse {

	public HerdaClasse() { this(0, 0.0, ""); }
	
	public HerdaClasse(int valor1, double valor2, String nome) { 
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.nome = nome;
	}

	@Override
	public void obrigatorioImplementar() {
		
		/*
			Este método é abstrato na classe pai,
			portanto é obrigatório reescrever ele aqui.
		*/
		
	}
}
