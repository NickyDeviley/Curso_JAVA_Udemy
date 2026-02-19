package HerancaPolimorfismo;

public class Funcionario {

	protected String name;
	protected int horas;
	protected double valorPorHora;
	
	public Funcionario() {
		this("", 0, 0.0);
	}
	
	public Funcionario(String name, int horas, double valorPorHora) {
		this.name = name;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		
		return valorPorHora * horas;
		
	}
	
	// Métodos set
	public void setName(String name) { this.name = name; }
	public void setHoras(int horas) { this.horas = horas; }
	public void setValorPorHora(double valorPorHora) { this.valorPorHora = valorPorHora; }
	
	// Métodos get
	public String getName() { return this.name; }
	public int getHoras() { return this.horas; }
	public double getValorPorHora() { return this.valorPorHora; }
	
}
