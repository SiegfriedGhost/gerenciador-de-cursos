package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome; 
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	//Polimorfismo
	//private List<Aula> aulas = new LinkedList<Aula>();
	
	public Curso(String nome, String instrutor) {
		//super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
//	public List<Aula> getAulas() {
//		return aulas;
//	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + this.nome + "Curso: " + this.instrutor + ", " + "Aulas: " + this.aulas; 
	}
	
}
