package Composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date momento;
	private String titulo;
	private String conteudo;
	private int likes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {}
	
	public Post(Date momento, String titulo, String conteudo, int likes) {
		
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
		
	}

	public String toString() {
		return "Hora da postagem: "
			 + this.momento + "\n"
			 + "Titulo: "
			 + this.titulo + "\n"
			 + "Conteudo: "
			 + this.conteudo + "\n"
			 + "Likes: "
			 + this.likes;
	}
	
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public List<Comentario> getComentarios() {
		return this.comentarios;
	}
	
	public Date getMomento() {
		return this.momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getLikes() {
		return this.likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	
}
