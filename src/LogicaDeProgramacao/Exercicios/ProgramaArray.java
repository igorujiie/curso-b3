package LogicaDeProgramacao.Exercicios;

public class ProgramaArray {
    public static void main(String[] args) {

        System.out.println(Cor.values());

        Cor[] cores = Cor.values();

        int [] numeros = {1,2,3};
        int [] numeros2 = new int[]{1,2,3};
        int [] numeros3 = new int[3];

        System.out.println(numeros.length);
        System.out.println(cores.length);
        System.out.println(cores[0]);


    }
}
