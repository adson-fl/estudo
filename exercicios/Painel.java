package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentarios;
import entidades.Post;

public class Painel {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Comentarios c1 = new Comentarios("have a nice trip"); 
		Comentarios c2 = new Comentarios("olha la ");
		Comentarios c3 = new Comentarios("aqui");
		
		
		Post p1 = new Post(dataFormat.parse("23/04/2023"), "porque o java é chato", "as dificuldades da linguagem", 32 );
		p1.addComentarios(c1);
		p1.addComentarios(c2);
		p1.addComentarios(c3); 
		
		Comentarios c4 = new Comentarios("um otimo artigo"); 
		Comentarios c5 = new Comentarios("não concordo com alguns argumrntos desse artigo");
		
		Post p2 = new Post(dataFormat.parse("02/12/2023"), "o python e a barreira da compilação", "isso vem redusindo o seu alcance no desenvolvimento de IA", 20 );
		p2.addComentarios(c4);
		p2.addComentarios(c5); 
		
		System.out.println(p1);
		
		System.out.println(p2);
		
		
		
	
		
	}

}
