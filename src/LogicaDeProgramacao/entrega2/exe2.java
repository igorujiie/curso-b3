package LogicaDeProgramacao.entrega2;

import java.util.Scanner;

/*
Uma loja de roupas decidiu aquecer suas vendas lançando uma promoção com descontos especiais para clientes que
comprassem mais de uma peça. As condições da promoção dizem que, na compra de duas peças, será dado 50% de desconto na
peça de menor de valor.

Escreva uma função que receba um array contendo o preço das peças de um cliente e calcule o valor total sem descontos,
o valor total de descontos, e o valor total a pagar. A saída da função deve ser uma String.

Ex:
Entrada: [20.0, 40.0]
Saída: Valor total: 60.0 | Valor de descontos: 10.0 | Valor a pagar: 50.0

Ex:
Entrada: [20.0, 40.0, 30.0]
Saída: Valor total: 90.0 | Valor de descontos: 10.0 | Valor a pagar: 80.0

*  */
public class exe2 {
    public static String geraRecibo(double[] input)
    {
        int i= 0;
        double menorValor = input[0];
        double soma = 0;
        double desconto;

        while (i < input.length) {
            soma += input[i];
            if (input[i] < menorValor){
                menorValor = input[i];
            }
            i++;
        }
        desconto = menorValor * 0.5;

        return "Valor total: " + soma + " | Valor de descontos: " + desconto + " | Valor a pagar: " + (soma - desconto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de peças que deseja comprar: ");
        int quantidade = sc.nextInt();

        double[] pecas = new double[quantidade];

        int i = 0;
        while (i < quantidade) {
            System.out.println("Digite o preço da peça: ");
            pecas[i] = sc.nextDouble();
            i++;
        }

        String recibo = geraRecibo(pecas);

        System.out.println(recibo);
    }

}
