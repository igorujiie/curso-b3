package POO;

public class PrimeiraAula {
    public static void main(String[] args) {

        //sem Poo
        int idade =30;
        String nome = "Rodolfho";
        System.out.println("ola, meu nome é " + nome + " e tenho " + idade + " anos");

        nome = "igor";
        idade = 25;
        System.out.println("ola, meu nome é " + nome + " e tenho " + idade + " anos");

        //com Poo
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Kazu";
        pessoa1.idade = 18;
        pessoa1.apresentacao();

    }
}
