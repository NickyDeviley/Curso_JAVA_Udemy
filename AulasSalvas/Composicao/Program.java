package Composicao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Date data = Date.from(Instant.now());
		String titulo = "Jogando Stardew Valley!";
		String conteudo = "Estou jogando Stardew Valley! \nQue jogo maravilhoso!";
		int likes = 20;
		
		String titulo2 = "Jogando Half Life 2!";
		String conteudo2 = "Estou jogando Half Life 2! \nQue jogo maravilhoso!";
		int likes2 = 30;
		
		Post postagem1 = new Post(data, titulo, conteudo, likes);
		Post postagem2 = new Post(data, titulo2, conteudo2, likes2);
		
		postagem1.addComentario(new Comentario("Eu já joguei, adoro esse jogo!"));
		postagem1.addComentario(new Comentario("Esse jogo é muito daora!"));
		postagem2.addComentario(new Comentario("Eu sempre amei esse jogo!"));
		postagem2.addComentario(new Comentario("The right man in the wrong place can make all the difference in the world!"));
		
		System.out.println(postagem1);
		System.out.println("Comentários: ");
		for (Comentario n : postagem1.getComentarios()) {
			System.out.println(n.getComentario());
		}
		
		System.out.println("\n");
		System.out.println(postagem2);
		System.out.println("Comentários: ");
		for (Comentario n : postagem2.getComentarios()) {
			System.out.println(n.getComentario());
		}
		
	}
	
}
