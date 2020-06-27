package lista.matrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * 1. Faça um programa que leia uma matriz de 5 linhas e 4 colunas contendo as
		 * seguintes informações sobre alunos de uma disciplina, sendo todas as
		 * informações do tipo inteiro: • Primeira coluna: numero de matrícula (use um
		 * inteiro) • Segunda coluna: media das prova • Terceira coluna: media dos
		 * trabalhos • Quarta coluna: nota final Elabore um programa que: (a) Leia as
		 * tres primeiras informações de cada aluno (b) Calcule a nota final como sendo
		 * a soma da media das provas e da média dos trabalhos (c) Imprima a matrícula
		 * do aluno que obteve a maior nota final (assuma que só existe uma maior nota)
		 * (d) Imprima a media aritmética das notas finais
		 */

		Scanner sc = new Scanner(System.in);

		int[][] aluno = new int[3][4];
		int notaFinal = 0;
		int alunoMelhorNota = 0;
		int somaNotasFinais = 0;
		int mediaNotasFinais = 0;

		System.out.println("Nº Matricula | Media das provas | Media dos trabalho | Nota final");

		for (int i = 0; i < aluno.length; i++) {
			for (int j = 0; j < aluno[i].length - 1; j++) {
				aluno[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < aluno.length; i++) {

			aluno[i][3] = aluno[i][1] + aluno[i][2];
			somaNotasFinais += aluno[i][3];
		}

		mediaNotasFinais = somaNotasFinais / aluno.length;

		for (int i = 0; i < aluno.length; i++) {

			if (aluno[i][3] > notaFinal) {
				notaFinal = aluno[i][3];
				alunoMelhorNota = aluno[i][0];
			}

		}

		System.out.println("Aluno com maior nota final: " + alunoMelhorNota);
		System.out.println("Média aritmética das notas finais: " + mediaNotasFinais);

		sc.close();
	}

}
