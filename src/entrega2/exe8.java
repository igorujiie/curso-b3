package entrega2;


import java.util.Arrays;
import java.util.Scanner;

/* Maria está olhando o mercado de automóveis para comprar um carro novo. Ela identificou que o preço final do veículo
tem um percentual relacionado ao distribuidor e também um percentual de impostos. Ela deseja identificar qual veículo
possui os menores percentuais de imposto e do distribuidor, para fazer a escolha do seu carro novo.

Para ajudar Maria em sua busca, crie uma função que receba um array com o preço de final de fábrica, o valor do custo
com o distribuidor e o valor do preço dos impostos. Ao final, a função deve retornar um array com o percentual do custo
do distribuidor e o percentual do custo com os impostos, seguindo essa ordem.

Realize o arredondamento para duas casas decimais em relação aos dados de retorno.

Ex:
Entrada: [100000.00, 12000.00, 20000.00]
Saída: [12.00, 20.00]

Ex:
Entrada: [115500.00,25000.00, 32500.00]
Saída: [21.64, 28.14]
*/
public class exe8 {
    public static double[] custosCarro( double[] input) {
        double[] percentuais = new double[2];
        percentuais[0] = (input[1] / input[0]) * 100;
        percentuais[1] = (input[2] / input[0]) * 100;

        percentuais[0] = Math.round(percentuais[0] * 100.0) / 100.0;
        percentuais[1] = Math.round(percentuais[1] * 100.0) / 100.0;
        return percentuais;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço final de fábrica: ");
        double precoFabrica = sc.nextDouble();

        System.out.println("Digite o valor do custo com o distribuidor: ");
        double custoDistribuidor = sc.nextDouble();

        System.out.println("Digite o valor do preço dos impostos: ");
        double precoImpostos = sc.nextDouble();

        double[] custos = {precoFabrica, custoDistribuidor, precoImpostos};

        double[] percentuais = custosCarro(custos);

        System.out.println(Arrays.toString(percentuais));


    }
}
