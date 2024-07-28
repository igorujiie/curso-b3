package entrega2;


import java.util.Scanner;

/*
No dia a dia é comum trabalhar com conjuntos de dados e, em casos específicos, é necessário usar algum padrão de
organização para melhor entender os dados. Como exemplo podemos citar uma chamada em classe. Geralmente, esse
procedimento segue o padrão da ordem alfabética, isto é, uma forma de ordenação.

Crie uma função que recebe um conjunto de dados (inteiros), faz a ordenação dos dados de forma crescente e retorna o
conjunto dos dados ordenados.

Obs.: Tanto o parâmetro de entrada como o de saída da função devem ser do tipo array

 */
public class exe9 {
    public static int[] ordenar(int[] input) {
        int i = 0;
        while (i < input.length) {
            int j = 0;
            while (j < input.length) {
                if (input[i] < input[j]) {
                    int aux = input[i];
                    input[i] = input[j];
                    input[j] = aux;
                }
                j++;
            }
            i++;
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja ordenar: ");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];
        int i = 0;
        while (i < quantidade) {
            System.out.println("Digite o número: ");
            numeros[i] = sc.nextInt();
            i++;
        }

        int[] numerosOrdenados = ordenar(numeros);
        System.out.println("Números ordenados: ");
        System.out.println(java.util.Arrays.toString(numerosOrdenados));

        sc.close(); // Fechar o scanner para liberar recursos
    }
}

