package Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		/*
		 	Composição é quando uma classe depende utiliza
		 	outras classes para compor ela.
		 	
		 	Imagine duas classes, carro e motor.
		 	
		 	Um carro tem um motor, então a classe carro
		 	instanciará um objeto motor.
		*/
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Departamento dpt;
		LevelTrabalhador nivel;
		String nome;
		double salarioBase;
		int qtdContratos;
		
		Date data;
		double valorHora;
		int horas;
		
		System.out.print("Qual o nome do departamento?");
		dpt = new Departamento(sc.next());
		
		System.out.println();
		System.out.print("Qual é o nome do trabalhador?");
		nome = sc.next();
		
		System.out.println();
		System.out.print("Qual o nível do trabalhador?");
		nivel = LevelTrabalhador.valueOf(sc.next());
		
		System.out.println();
		System.out.print("Qual o salário do trabalhador?");
		salarioBase = sc.nextDouble();
		
		Trabalhador tbr = new Trabalhador( nome, nivel, salarioBase, dpt);
		
		System.out.println();
		System.out.print("Quantos contratos esse funcionário tem? ");
		qtdContratos = sc.nextInt();
		
		for (int i = 0; i < qtdContratos; i++) {
			
			System.out.println();
			System.out.println("Digite as informações do contrato #" + (i+1) + ": " );
				
			System.out.println();
			System.out.print("Digite a data do contrato. (dia/mes/ano): ");
			data = sdf.parse(sc.next());
			
			System.out.println();
			System.out.print("Qual o valor Hora? ");
			valorHora = sc.nextDouble();
			
			System.out.println();
			System.out.print("Quantas horas? ");
			horas = sc.nextInt();
			
			tbr.addContrato(new Contrato(data, valorHora, horas));
			
		}
		
		System.out.println("Entre com o mes e ano (MM/yyyy): ");
		String numero = sc.next();
		int mes = Integer.parseInt(numero.substring(0, 2));
		int ano = Integer.parseInt(numero.substring(3));
		
		System.out.println("\n\n" 
						  + "nome: " + tbr.getNome()
						  + "\n"
						  + "Departamento: " + tbr.getDepartamento().getNome()
						  + "\n" 
						  + "Income: " + tbr.income(ano, mes));
		
		
		sc.close();
	}
	
}
