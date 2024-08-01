package POO;

public class Cumbuca {

    Formato formato;
    String cor;
    double peso;

    boolean estaCheia;

    public void encher(){
        estaCheia = true;
    }

    public void emUso(){
        if (estaCheia){
            System.out.println("A cumbuca está cheia");
        } else {
            System.out.println("A cumbuca  está vazia");
        }
    }

}
