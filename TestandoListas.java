package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de Listas.";
		String aula2 = "Trabalhando com Datasets";
		String aula3 = "Conhecendo Java.Lang";
	
		ArrayList<String> aulas = new ArrayList<>();
	
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		//Para cada string aula dentro de aula 
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
						
		}
		
		System.out.println("A primeira aula é: " + aulas.get(0));
		
		for(int i=0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		//Lambda
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula: " + aula);
		});
	
		//Ordenando Listas 
		aulas.add("Aumentando o nosso conhecimento!");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}
