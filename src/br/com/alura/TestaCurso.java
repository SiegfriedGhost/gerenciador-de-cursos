package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		
		//System.out.println(aulas);
	    javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(javaColecoes);
		//System.out.println(aulas == javaColecoes.getAulas());

	}

}
