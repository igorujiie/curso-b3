package entrega2;

import java.util.Scanner;

/*
 João é um empresário do ramo de construção civil e decidiu adotar novos critérios para dar reajuste salarial para seus
 funcionários. Agora, o reajuste vai ser dado seguindo as regras abaixo.

Tempo de serviço:

de 1 até 5 anos => 1%
de 5 até 10 anos => 1.5%
10 ou mais anos => 2%
O valor total percentual para o reajuste vai ser a soma do percentual de tempo de serviço mais o percentual da inflação.

Para ajudar João a calcular o valor do reajuste salarial de seus funcionários, crie uma função que recebe um array como
entrada. A posição 0 do array é o tempo de serviço, a posição 1 é o valor da inflação e a posição 3 é o salário atual do
funcionário. Sua função deve calcular o novo salário e retorna-lo.

Considere arredondamento de duas casas decimais para o salário retornado.

Ex:
Entrada: [1, 5.0, 2000.00]
novoSalario = 2000.00 * (1 + (1% + 5%)) = 2000.00 * 1.06
Saída: 2120.00

Ex:
Entrada: [11, 4.5, 2500.00]
novoSalario = 2500.00 * (1 + (2% + 4.5%)) = 2500.00 * 1.065
Saída: 2662.50

 */
public class exe5 {
    public static double calculoSalario(double[] input) {
        if (input[0] >= 1 && input[0] <= 5) {
            return Math.round(input[2] * (1 + (0.01 + input[1] / 100)) * 100.0) / 100.0;
        } else if (input[0] > 5 && input[0] <= 10) {
            return Math.round(input[2] * (1 + (0.015 + input[1] / 100)) * 100.0) / 100.0;
        } else {
            return Math.round(input[2] * (1 + (0.02 + input[1] / 100)) * 100.0) / 100.0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo de serviço: ");
        double tempoServico = sc.nextDouble();

        System.out.println("Digite o valor da inflação: ");
        double inflacao = sc.nextDouble();

        System.out.println("Digite o salário atual do funcionário: ");
        double salario = sc.nextDouble();

        System.out.println("novosalario = " + salario * (1 + (0.01 + inflacao / 100)));

        double[] dados = {tempoServico, inflacao, salario};

        System.out.println(calculoSalario(dados));
    }
}
