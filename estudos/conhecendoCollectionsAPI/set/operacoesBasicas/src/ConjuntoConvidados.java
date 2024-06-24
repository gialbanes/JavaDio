import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    //construtor 
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }
    //Adiciona um convidado ao conjunto.
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    //Remove um convidado do conjunto com base no código do convite.
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        // dizendo que os convidados são diferentes por conta do código
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;  //para pq a partir do momento que o convidado é removido não existe mais nenhum igual ao codigo forneceido
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    //Conta o número total de convidados no Set.
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        // Adicionando convidados ao conjunto
    conjuntoConvidados.adicionarConvidado("Alice", 1234);
    conjuntoConvidados.adicionarConvidado("Bob", 1235);
    conjuntoConvidados.adicionarConvidado("Charlie", 1235);
    conjuntoConvidados.adicionarConvidado("David", 1236);

    // Exibindo os convidados no conjunto
    System.out.println("Convidados no conjunto:");
    conjuntoConvidados.exibirConvidados();

    // Exibindo o número atualizado de convidados no conjunto
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    // Removendo um convidado do conjunto por código de convite
    conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

    // Exibindo os convidados atualizados no conjunto
    System.out.println("Convidados no conjunto após a remoção:");
    conjuntoConvidados.exibirConvidados();
    }
}
