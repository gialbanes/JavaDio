
import java.util.ArrayList;
import java.util.List;
public class ListaTarefa { 
    // sempre que eu criar um objeto do tipo ListaTarefa automaticamente eu já tenho um atributo tarefaList com um ArrayList vazio esperando
    private List<Tarefa> tarefaList; //criando um atributo tarefaList que é uma lista de objetos "Tarefa"

    public ListaTarefa(){ //construtor
        this.tarefaList = new ArrayList<>(); //inicializa o atributo como um array vazio 
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); // cria um novo objeto Tarefa com a descrição e é adicionado à tarefaList
    }
    public void removerTarefa(String descricao){
        //pode ter elementos repetidos então:
        List<Tarefa> tarefasParaRemover = new ArrayList<>();//lista vazia com as tarefas para remover
        for(Tarefa t : tarefaList){ // Itera sobre cada tarefa "t" na lista "tarefaList"
            if(t.getDescricao().equalsIgnoreCase(descricao)){ // se a descricao da tarefa "t" for igual a descricao que esta passando lá em cima, a tarefa é adicionada ao array das tarefas para serem removidas
                tarefasParaRemover.add(t);
            }
        } 
        tarefaList.removeAll(tarefasParaRemover);  //pegou a lista original e remova tudo que estiver dentro da tarefas para remover
    }
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size(); //retorna a quantidade inteira do número de elementos dentro da lista
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList); //imprime uma lista de tarefa 
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        // testando método de add tarefa
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        //testando método de remover tarefa 
        // aqui deve ser 1, já que exclui os dois iguais
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        // testando o método de obter descrição
        // aqui deve ser [Tarefa 2]
        listaTarefa.obterDescricoesTarefas();
    }
}
