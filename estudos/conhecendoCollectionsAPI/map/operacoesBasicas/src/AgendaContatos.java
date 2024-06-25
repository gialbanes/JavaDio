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
}
