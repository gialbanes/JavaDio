import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //atributo 
    private Map<LocalDate, Evento> eventoMap;

    //construtor
    public AgendaEventos(){
        this.eventoMap = new HashMap<>();
    }
    //Adiciona um evento à agenda.
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }
    //Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); //eles já estao ordenados em forma crescente devido ao LocalDate
        System.out.println(eventosTreeMap);
    }
    //Retorna o próximo evento que ocorrerá.
    public void obterProximoEvento(){
        //sempre que eu executar, o sistema deve dar a data atual
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); //eles já estao ordenados em forma crescente devido ao LocalDate
            for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) { // o entrySet retorna um set, onde trá objetos do tipo map.entry, o qual sabe apontar a chave e o valor correspondente
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                    break;
                }
            }
        }
    public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.obterProximoEvento();
  }
}
