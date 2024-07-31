package LogicaDeProgramacao.Exercicios;

public enum Cor {
    // #FFFF00 - amarelo
    // #008000 - verde
    // #0000FF - azul
    AMARELO ("#FFFF00"), VERDE ("#008000"), AZUL(" #0000FF ");

    //atributo
    private String codigoHexa;

    //construtor
     Cor(String codigoHexa) {
        this.codigoHexa = codigoHexa;

    }

    //Getter
    public String getCodigoHexa() {
        return codigoHexa;
    }

    //Setter
    public void setCodigoHexa(String codigoHexa) {
        this.codigoHexa = codigoHexa;
    }
}
