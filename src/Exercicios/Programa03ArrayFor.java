package Exercicios;

import java.util.Arrays;

public class Programa03ArrayFor {
    public static void main(String[] args) {
        //ExemploFor

        //Exemplo Array

        //foreach
//        int[] x = new int[3];
//        for(int valor : x){
//            System.out.println(valor);
//        }

        String palavra01 = " Leão-Marinho ";
//        String palavra02 = palavra01.replace("ão", "ao");
//        String palavra03 = Arrays.toString(palavra01.split("-"));
//        String palavra04 = " Leão-Marinho ";
//
//        System.out.println(palavra01.length());
//        System.out.println(palavra02);
//        System.out.println(palavra03);
//        System.out.println(palavra01.indexOf("i"));
//        System.out.println(palavra01.equals(palavra02));


        String[] partes = palavra01.split("-");
        if (partes.length == 2) {
            String parte1 = partes[0].trim();
            String parte2 = partes[1].trim();
            System.out.println("03. Parte 1: " + parte1);
            System.out.println("03. Parte 2: " + parte2);
        } else {
            System.out.println("03. A string não contém um hífen ou contém mais de um hífen.");

        }

        String concat =partes[0].concat(partes[1]);
        System.out.println("Concat: " + concat);

        String palavra05 = palavra01.toLowerCase();
        System.out.println("05. " + palavra05);

        String palavra06 = palavra01.trim();
        //verificar se a variável termina com `nho` e indicar se sim ou não
        boolean palavra08 = palavra06.endsWith("nho");
        System.out.println("a palavra termina com -nho: " + palavra08);


        Boolean palavra07 = palavra01.isBlank();
    }
}
