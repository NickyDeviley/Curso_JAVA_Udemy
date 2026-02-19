package Exercicio_Abs;

public final class PessoaFisica extends Pessoa {

	private double gastosSaude;
	
	public PessoaFisica() { this("", 0.0, 0.0); }
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double calcImposto() {

		if (gastosSaude > 0) {
			if (this.rendaAnual < 20000.00) {
				return (this.rendaAnual * 1.15) - (gastosSaude * 1.5);
			}
			else {
				return (this.rendaAnual * 1.25) - (gastosSaude * 1.5);
			}
		}
		else {
			if (this.rendaAnual < 20000.00) {
				return (this.rendaAnual * 1.15);
			}
			else {
				return (this.rendaAnual * 1.25);
			}
		}
		
	}

}
