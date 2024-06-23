public class Tarefa {
    //atributo 
    private String descricao;

    //construtor da classe Tarefa
    public Tarefa(String descricao){ //recebe a descricao e cria o objeto do tipo tarefa
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    //template 
    @Override
    public String toString(){
        return descricao; //quando pedir p imprimir a descricao da tarefa vai mostrar isso
    }
}
