package LogicaDeProgramacao.Exercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        //exemploFor();

        // aqui criou o array
        Random random = new Random();
        double[] numeros = new double[10];
        for (int i = 0; (numeros.length > i); i++) {
            // numeros[i] = Math.random();
            numeros[i] = random.nextDouble(10);
            System.out.print(numeros[i]+ " : ");
        }

        // montar novo array apenas os numeros abaixo de 5
        double[] novoarray = new double[10];
        int j = 0;
        for (int i = 0; (numeros.length > i); i++) {
            double numero = numeros[i];
            // indice de navegacao = i .. indice de atribuicao = j
            if (numero < 5)
                novoarray[j++] = numero;
        }

        // apenas imprime
        for (int i=0; (novoarray.length > i); i++) {
            System.out.print(novoarray[i]+ " : ");
        }

    }

}




