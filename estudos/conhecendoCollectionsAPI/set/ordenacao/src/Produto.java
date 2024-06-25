import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, long codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    //verifica se o produto que ele esta consultando na ordem alfabetica maior ou menor do que o proximo produto que ele esta fazendo a comparacao
    // p fazer o método exibirProdutosPorNome()
    public int compareTo(Produto p){
        return nome.compareToIgnoreCase(p.getNome());
    }
    //getters
    public String getNome(){
        return nome;
    }
    public long getcodigo(){
        return codigo;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    //para um produto ser igual, ele deve ter o mesmo codigo, daí não preciso colocar ele dentro do Set de novo
    @Override
    public boolean equals(Object o){ //utilizado para comparar dois objetos para verificar se são iguais
        if(this == o) return true; // Verifica se os dois objetos referem-se ao mesmo endereço de memória
        if(!(o instanceof Produto produto)) return false; // Verifica se o objeto passado é uma instância de Contato
        return getcodigo() == produto.getcodigo(); // Compara os nomes dos contatos
    }
    @Override
    //se os dois objetos forem iguais, eles devem ter o mesmo valor de hashcode
    //o valor de hash é calculado com base no atributo codigo do produto
    public int hashCode(){
        return Objects.hash(getcodigo());
    }
    @Override
    public String toString() {
    return "Produto{" +
        "codigo=" + codigo +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
    }
    @Override
    public int compareTo(Produto o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
