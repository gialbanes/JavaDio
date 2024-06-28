
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(7);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /* Conteudo conteudo = new Mentoria(); polimorfismo, instanciei uma mentoria a partir da classe conteudo; nao posso instanciar um conteudo pq é uma classe abstrata;*/

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
