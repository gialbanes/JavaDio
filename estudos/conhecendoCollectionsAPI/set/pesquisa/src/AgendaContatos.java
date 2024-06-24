import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    //construtor
    //não quero receber, inicio instanciando um hashset
    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    //Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    //Exibe todos os contatos da agenda.
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    //Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    //retorna um set com os contatos que começam com Camila, por exemplo; não retorna com equals ou hashcode
    public Set<Contato> pesquisarPorNome (String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){ //método da classe String para verificar se uma string começa com uma determinada sequência de caracteres
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    //Atualiza o número de telefone de um contato específico
    //passo o nome do contato que eu quero atualizar
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){ // navego por todo o set
            if(c.getNome().equalsIgnoreCase(nome)){ // se o nome do contato for igual ao parâmetro, encontrei o objeto
                //substituindo o numero do c
                //altero o número 
                c.setNumero(novoNumero); 
                contatoAtualizado = c;  //retorno o contato atualizado
                break; // quebro pq não tem mais o conato 
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();
    
        // Adicionando contatos à agenda
        // Os contatos não foram adicionados na ordem de inserção
        // todos os cotatos foram add pq nenhum possui nome igual a outro
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();
    
        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    
        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
      }
}
