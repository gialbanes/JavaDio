import java.util.ArrayList;
import java.util.List; 

public class CatalogoLivros {
    //atributo
    private List<Livro> livrosList;//criando um atributo livrosList que é uma lista de objetos "Livro"

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>(); //inicializa o atributo com um array vazio
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){ // para retornar o livro: List<Livro>
        List<Livro> livrosPorAutor = new ArrayList<>(); // lista vazia dos livros do mesmo autor
        //verificar se a lista está vazia
            if(!livrosList.isEmpty()){ // para veriricar se a lista está vazia; retorna true or false; !: fazendo negativa; se for true nem comeca o metodo
                for(Livro  l : livrosList){ // itera a cada livro "l" na lista "livrosList"
                    if(l.getAutor().equalsIgnoreCase(autor)){ // se o autor do livro "l" for igual ao autor do parâmetro, o livro é add ao array dos livros por autor
                        livrosPorAutor.add(l);
                    }
                }
            }
            return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>(); // lista dos livros no intervalo de tempo
            if(!livrosList.isEmpty()){ // para veriricar se a lista está vazia; retorna true or false; !: fazendo negativa; se for true nem comeca o metodo
                for(Livro l : livrosList){ // itera a cada livro "l" na lista "livrosList"
                    if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){ // se o ano de publicao do livro estiver entre o intervalo definido, o livro é add ao array de livros por intervalo de tempo
                        livrosPorIntervaloAnos.add(l);
                    }
                }
            }
            return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null; //está vazio pq ainda não tem nenhum objeto do tipo livro de acordo com o titulo
        if (!livrosList.isEmpty()) { // para veriricar se a lista está vazia; retorna true or false; !: fazendo negativa; se for true nem comeca o metodo
            for(Livro l : livrosList){ // itera a cada livro "l" na lista "livrosList"
                if(l.getTitulo().equalsIgnoreCase(titulo)){ 
                    livroPorTitulo = l; // pegando o objeto encontrado "l" dentro do List e atribuindo a referencia livroPorTItulo
                    break; //pq o exercicio pediu somente o primeiro livro encontrado
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);

        /*System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));*/
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
