package LogicaDeProgramacao.Exercicios;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        //Exercicio 2
        //Faça um programa que leia o nome e a idade de 5 alunos e ao final informe a média das idades.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos= sc.nextInt();

        String nome [] = new String[qtdAlunos];
        int idade [] = new int[qtdAlunos];
        int soma = 0;

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i+1) + ": ");
            nome[i] = sc.next();
            System.out.println("Digite a idade do aluno " + (i+1) + ": ");
            idade[i] = sc.nextInt();
            soma += idade[i];
        }

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Nome do aluno " + (i+1) + ": "+ nome[i] + "," + " Idade: " + idade[i]);
        }

        double media = soma / qtdAlunos;
        System.out.println("media das idades: " + media);
    }
}
