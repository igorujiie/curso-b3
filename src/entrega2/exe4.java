package entrega2;


/*
Dentro dos conjuntos numéricos existem vários subconjuntos, dentre eles os subconjuntos dos números pares e dos números ímpares. Os números pares são todos os números múltiplos de 2, enquanto os números ímpares são o números não pares, ou seja, são os números que não são múltiplos de 2. Esse conjunto de números terminam com algum dos algarismos 1, 3, 5, 7 ou 9.

Crie uma função que recebe um array de números inteiros, identifica os números como pares ou ímpares e retorna uma String informando a quantidade de pares, seguido de uma vírgula e, depois, a quantidade de ímpares.

Obs.: Atenção para a flexão do plural no texto de saída

Ex:
Entrada: 1,2,3,6,9
Saída: 3 pares, 3 ímpares

Ex:
Entrada: 2,3,6
Saída: 2 pares, 1 ímpar*/


import java.util.Arrays;
import java.util.Scanner;

public class exe4 {

    public static String parImpar(int[] input) {
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        return pares + " pares, " + impares + " ímpares";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os numeros separados por virgula: ");
        String[] numeros = sc.nextLine().split(",");

        int[] numerosInt = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            try {
                numerosInt[i] = Integer.parseInt(numeros[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Número inválido: " + numeros[i]);
                sc.close();
                return;
            }
        }


        String resultado = parImpar(numerosInt);
        System.out.println(resultado);


    }
}
