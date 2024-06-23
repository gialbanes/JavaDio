public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){ //quando for criado um objeto do tipo livro é necessário passar o titulo, autor e ano
        this.titulo=titulo;
        this.autor=autor;
        this.anoPublicacao=anoPublicacao;
    }
    //getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    @Override
    public String toString(){ // p quando for imprimir não aparecer o espaço alocado na memória
        return "Livro{"+ "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", anoPublicacao" + anoPublicacao + '}';
    }
}
