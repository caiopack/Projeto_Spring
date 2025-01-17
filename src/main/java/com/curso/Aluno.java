package com.curso;

public class Aluno {

	public int getNotaDoAluno(int a, int b) {
		
		// TODO remover apos corrigir para o cliente
		if(b == 0) {
			b = 1;
		}
		
		// FIXME ajuste na divisao por zero
		int nota = a / b;
		
		// FIXME retornar outro valor quando a divisao for zero
		return nota;
				
	}
}
