public abstract class Conteudo { //abstract: nao consigo instanciar o conteudo
    protected static final double xp_padrao = 10; //uma constante; static: pode acessar o xp fora da classe, nesse caso, as classes filhas;
    
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
