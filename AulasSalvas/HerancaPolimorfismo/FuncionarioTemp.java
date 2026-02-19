package HerancaPolimorfismo;

public class FuncionarioTemp extends Funcionario {

	private double cargaAdicional;
	
	public FuncionarioTemp() {
		
	}
	
	public FuncionarioTemp(String name, int horas, double valorPorHora, double cargaAdicional) {
		
		this.name = name;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
		this.cargaAdicional = cargaAdicional;
	}
	
	@Override
	public double pagamento() {
		
		return (this.valorPorHora * this.horas) + (this.cargaAdicional *= 1.1);
		
	}
}
