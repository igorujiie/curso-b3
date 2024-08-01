package POO;

public class PrimeiraAula {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Kazu";
        pessoa1.idade = 18;
        pessoa1.apresentacao();

        Cumbuca cumbuca = new Cumbuca();
        cumbuca.formato = Formato.REDONDO;
        cumbuca.cor = "Azul";
        cumbuca.peso = 0.5;
        cumbuca.estaCheia = false;
        cumbuca.encher();
        cumbuca.emUso();

        cumbuca = new Cumbuca();



    }
}
