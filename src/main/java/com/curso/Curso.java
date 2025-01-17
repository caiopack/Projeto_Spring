package com.curso;

public class Curso implements Runnable{
	
	
	

	public String mostraDados() {
		
		Aluno alunoA = new Aluno();
		
		Aluno alunoB = new Aluno();
		
		System.out.println(alunoA.getNotaDoAluno(10,1));
		
		System.out.println(alunoB.getNotaDoAluno(10,0));
		
		String valor = "Ola";
		
		return valor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
