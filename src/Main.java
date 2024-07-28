import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        //InsirA  AS NOTas e calcule a media
//        Scanner sc = new Scanner(System.in);
//
//        // Declaração do array para armazenar as notas
//        double[] notas = new double[5];
//
//        double soma = 0;
//        // Pedir as 5 notas do aluno
//        for (int i = 0; i < notas.length; i++) {
//            System.out.print("Digite a nota " + (i + 1) + ": ");
//            notas[i] = sc.nextDouble();
//            soma += notas[i];
//        }
//        System.out.println("Notas do aluno:");
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
//        }
//
//        System.out.println("Média: " + (soma / notas.length));
//
//        sc.close();


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