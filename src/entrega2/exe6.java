package entrega2;
/*
Maria tem uma frutaria e está com uma promoção para quem comprar mais de 10 frutas (do mesmo item). As frutas com preços
 especiais são: Pera, Laranja, Maçã, Tomate e Caqui.

Comprando 10 unidades ou mais de qualquer fruta da promoção, o preço da unidade fica 1.25/cada. Caso a pessoa leve uma
quantidade inferior ou igual a 10, o preço individual da fruta fica em 1.45.

Faça uma função que recebe a quantidade de frutas que o cliente está levando e calcule o valor final a ser pago.

Arredonde o valor final da compra para 2 casas decimais.

Ex:
Entrada: 2
Saída: 2.90

Ex:
Entrada: 12
Saída: 15.00
* */
public class exe6 {
    public class Solution {
        public static double custoCompra(String fruta, int quantidade) {
            double valor = 0;
            if (quantidade >= 10 && (fruta.equals("Pera") || fruta.equals("Laranja") || fruta.equals("Maçã") || fruta.equals("Tomate") || fruta.equals("Caqui"))) {
                valor = quantidade * 1.25;
            } else {
                valor = quantidade * 1.45;
            }
            return Math.round(valor * 100.0) / 100.0;
        }
    }
}
