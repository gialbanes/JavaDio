import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    // chave e valor respectivamente
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>(); //implementação mais comum utilizada com Map
    }
    public void adicionarContato(String nome, Integer telefone){
        // aqui utilizamos put para add
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        //ter certeza de que esse map possui elementos para poder remover
        if(!agendaContatoMap.isEmpty()){ //se ela não estiver vazia remove o contato com base no nome que eu passar
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome); // quando determino um nome, ele retorna o numero, ou seja, o valor 
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
    
        agendaContatos.exibirContatos();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();
    
        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
      }
    }
