package entrega2;


import java.util.Scanner;

/*
Pedrinho trabalha com vendas de carro. Mensalmente, ele recebe um salário fixo mais comissões baseadas em suas vendas.
As comissões são as seguintes:

5% sobre o valor total vendido no mês
valor fixo por cada carro vendido

Faça uma função que recebe um array com: quantidade de carros vendidos por ele no mês, o valor total de
suas vendas no mês, seu salário fixo, valor fixo que recebido por carro vendido. Calcule e retorne qual o
salário dele (salário fixo mais comissões).

Arredonde o valor de retorno para duas casas decimais.

Ex:
Entrada: [3, 20000.00, 2000.00, 250.00]
Saída: 3750.00

Ex:
Entrada: [4,25000.00, 3500.00, 100.00]
Saída: 5150.00
*/
public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valores[] = new double[4];

        System.out.println("Digite a quantidade de veiculos vendidos");
        valores[0] = sc.nextDouble();

        System.out.println("diigite valor total de suas vendas no mês");
        valores[1] = sc.nextDouble();

        System.out.println("Digite seu salário fixo:");
        valores[2] = sc.nextDouble();

        System.out.println("digite valor fixo recebido por carro vendido");
        valores[3] = sc.nextDouble();

        sc.close();


        double salario = salarioComComissao(valores);
        System.out.printf("%.2f", salario);

    }

    public static double salarioComComissao(double[] input) {
        double salario = input[2] + (input[3] * input[0]) + (0.05 * input[1]);

        return Math.round(salario * 100.0) / 100.0;
    }
}
