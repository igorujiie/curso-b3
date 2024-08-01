package POO;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J. R. R. Tolkien";
        livro1.anoPublicacao = 1954;

        Livro livro2 = new Livro();
        livro2.titulo = "Java para iniciantes";
        livro2.autor = "Igor Ujiie" ;
        livro2.anoPublicacao = 1997;

        Livro livro3 = new Livro();
        livro3.titulo = "codigo limpo";
        livro3.autor = "Robert C. Martin";
        livro3.anoPublicacao = 2008;
    }
}
