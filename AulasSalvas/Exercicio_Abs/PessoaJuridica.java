package Exercicio_Abs;

public final class PessoaJuridica extends Pessoa {

	private int numeroDeFuncionarios;
	
	public PessoaJuridica() { this("", 0.0, 0); }
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
		
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
		
	}
	
	@Override
	public double calcImposto() {
		
		if (this.numeroDeFuncionarios >= 10) {
			return rendaAnual * 1.10;
		}
		else {
			return rendaAnual * 1.16;
		}
		
	}

	
	
}
