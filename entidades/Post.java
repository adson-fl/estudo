package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	
	private static final SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer like;
	
	// não se faz set
	private List<Comentarios> coment = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date momento, String titulo, String conteudo, Integer like) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.like = like;
		
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentario() {
		return conteudo;
	}

	public void setComentario(String comentario) {
		this.conteudo = comentario;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public List<Comentarios> getComent() {
		return coment;
	}
	// faz comentarios
	public  void addComentarios (Comentarios Coment) {
		coment.add(Coment);
	}
	// remove comentrios
	public  void removComentarios (Comentarios Coment) {
		coment.remove(Coment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// append significa acrecentar no final / o StringBuilder faz uma concatenação de Strings 
		sb.append(titulo + "\n"); 
		sb.append(like );
		sb.append(" like - ");
		sb.append(dataFormat.format(momento) + "\n");
		sb.append(conteudo);
		sb.append(" comentarios" + "\n"); 
		for(Comentarios c: coment) { 
			sb.append(c.getText() + "\n");
		}
			return sb.toString();
		
	}
}
