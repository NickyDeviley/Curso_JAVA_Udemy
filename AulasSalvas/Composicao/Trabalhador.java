package Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

	// Criando características para os objetos trabalhador
	private String nome;									// Nome
	private LevelTrabalhador nivel;							// Nível
	private double salarioBase;								// Salário base
	
	private Departamento departamento;						// Departamento
	private List<Contrato> contratos = new ArrayList<>();	// Contratos vínculados
	
	// Método construtor padrão
	public Trabalhador() {}

	// Método construtor que não interage com os contratos, apenas cria um novo trabalhador
	public Trabalhador(String nome, LevelTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	// Métodos para adicionar e remover um contrato
	public void addContrato(Contrato contract) { contratos.add(contract); }
	public void removeContrato(Contrato contract) { contratos.remove(contract); }
	
	// Método para calcular o quanto o funcionário ganhou em um mês de um ano específico
	public double income(int ano, int mes) {
		
		// Criando uma variável que será retornada
		// que recebe o salário base como padrão
		double soma = this.salarioBase;
		
		// Instanciando um calendario, para armazenar
		// a data e acessar os valores.
		Calendar cal = Calendar.getInstance();
		
		// Laço foreach para verificar cada contrato
		for (Contrato c : contratos) {
			
			// Determinando que o calendário
			// é igual a data do contrato
			cal.setTime(c.getData());
			
			// Criando variáveis para receber o ano
			// e o mês do calendario criado
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			//System.out.println("\n\n\n" + c_ano + c_mes + "\n\n\n");
			
			// Caso o ano e o mês do contrato
			// correspondam ao ano e mês procurados
			// o valor do contrato é somado a variável.
			if (mes == c_mes && ano == c_ano) {
				soma += c.totalHora();
			}
		}
		
		return soma;	// Retornando soma
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LevelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(LevelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public List<Contrato> getContrato() {
		return this.contratos;
	}
}
