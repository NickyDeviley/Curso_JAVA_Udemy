package Enumeradores;

public class Objeto {

	private Enumerador dia_semana;
	private int dia;
	private String nome;
	
	public Objeto() {
		this(null, 0, "");
	}

	public Objeto(Enumerador dia_semana, int dia, String nome) {
		this.dia_semana = dia_semana;
		this.dia = dia;
		this.nome = nome;
	}

	public Enumerador getDia_semana() {
		return dia_semana;
	}

	public void setDia_semana(Enumerador dia_semana) {
		this.dia_semana = dia_semana;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
}
