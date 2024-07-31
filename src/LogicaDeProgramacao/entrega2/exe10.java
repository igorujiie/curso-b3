package LogicaDeProgramacao.entrega2;

import java.util.Scanner;

/*Em uma danceteria o preço da entrada sofre variações. Segundas, Terças e Quintas, ela oferece um desconto de 25% do
preço normal de entrada. Nos dias de músicas ao vivo, o preço da entrada ainda é acrescido em 15% em relação ao preço
normal da entrada.

Faça uma função que recebe o dia da semana, o preço normal da entrada e se é dia de música ao vivo (“Sim”) ou
 não (“Não”). Os valores de entrada serão passados em um array seguindo essa ordem. Calcule e retorne o preço final que
 deverá ser pago pela entrada. Considere um arredondamento de três casas para o valor final da entrada.

Obs.: aplicar primeiro o desconto dos dias com desconto e depois o acréscimo de música ao vivo, quando os dois
descontos forem aplicados.

A entrada dos dias da semana será considerando um valor decimal, conforme os dados a seguir:

1.0 - segunda
2.0 - terça-feira
3.0 - quarta-feira
4.0 - quinta-feira
5.0 - sexta-feira
6.0 - sábado
7.0 - domingo
Para os dados referentes a música ao vivo, serão considerados: 1.0 - sim e 2.0 - não.

Ex:
Entrada: [3.0, 25.00, 2.0]
Saída: 25.000*/
public class exe10 {
        public static double valorEntrada(double[] input) {
            double valor = input[1];
            if (input[0] == 1.0 || input[0] == 2.0 || input[0] == 4.0) {
                valor = valor * 0.75;
            }
            if (input[2] == 1.0) {
                valor = valor * 1.15;
            }
            return Math.round(valor * 1000.0) / 1000.0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1.0 - segunda\n" +
                    "2.0 - terça-feira\n" +
                    "3.0 - quarta-feira\n" +
                    "4.0 - quinta-feira\n" +
                    "5.0 - sexta-feira\n" +
                    "6.0 - sábado\n" +
                    "7.0 - domingo\n");
            System.out.println("Digite o dia da semana: ");
            double dia = sc.nextDouble();

            System.out.println("Digite o preço normal da entrada: ");
            double preco = sc.nextDouble();

            System.out.println("É dia de musica ao vivo? 1.0 - sim, " +
                    "2.0 - não\n");
            double musica = sc.nextDouble();

            double[] entrada = {dia, preco, musica};

            double valor = valorEntrada(entrada);
            System.out.printf("%.3f", valor);


        }
    }

