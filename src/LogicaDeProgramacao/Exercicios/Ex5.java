package LogicaDeProgramacao.Exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o coeficiente A: ");
        int a = sc.nextInt();

        if(a==0){
            System.out.println("nao eh uma equacao de segundo grau.");
            return;
        }else {
            System.out.println("Digite o coeficiente B: ");
            int b = sc.nextInt();

            System.out.println("Digite o coeficiente C: ");
            int c = sc.nextInt();

            double delta = (Math.pow(b, 2) - (4 * a * c));
            System.out.println("Delta: " + delta);

            if (delta < 0) {
                System.out.println("nao possui raizes reais.");
            } else if (delta == 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("X1=X2 =" + x1);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        }

    }
}
