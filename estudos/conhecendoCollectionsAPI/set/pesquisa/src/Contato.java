import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int numero;

    //construtor
    //inicializa esses atributos com os valores passados como parâmetros
    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    //add o set pq quero atualizar o numero
    public void setNumero(int numero){
        this.numero = numero;
    }
    //para dizer que um contato é igual ao outro, é necessário verificar o nome; não pode existir dois contatos com nomes iguais, é necessário verificar iso antes de add um novo contato
    @Override
    public boolean equals(Object o){ //utilizado para comparar dois objetos para verificar se são iguais
        if(this == o) return true; // Verifica se os dois objetos referem-se ao mesmo endereço de memória
        if(!(o instanceof Contato contato)) return false; // Verifica se o objeto passado é uma instância de Contato
        return Objects.equals(getNome(), contato.getNome()); // Compara os nomes dos contatos
    }
    @Override
    //se os dois objetos forem iguais, eles devem ter o mesmo valor de hashcode
    //o valor de hash é calculado com base no atributo nome do contato
    public int hashCode(){
        return Objects.hash(getNome());
    }
    @Override
    public String toString() {
      return "{" + nome + "," + numero + "}";
    }
}
