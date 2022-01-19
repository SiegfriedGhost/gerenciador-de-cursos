package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Leandro Oliveira");
		alunos.add("Marcelos Lemes");
		alunos.add("Cesar Machado");
		alunos.add("Bruno Cesar");
		
		for (String aluno : alunos) {
			
			System.out.println(aluno);
			
		}
		System.out.println("=============================");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
	
		List<String> alunoEmLista = new ArrayList<>(alunos);
		
	}
	
		
	
}
