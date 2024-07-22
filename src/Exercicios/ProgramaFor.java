package Exercicios;

public class ProgramaFor {
    public static void main(String[] args) {
        Cor[] novasCores = Cor.values();
        Cor cor = null;
        for (int i = 0; (i < novasCores.length); i++) {
            cor = novasCores[i];
            System.out.println(cor);
            if (cor.equals(Cor.AZUL)) {
                System.out.println("achou");
                break;
            }
        }
        System.out.println("cor encontrada = " + cor);
    }


}
