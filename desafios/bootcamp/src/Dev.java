import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome; 
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //conforme eu me inscrevo, são armazenados na mesma ordem
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); //Set: usamos pq só podemos nos inscrever uma vez, ou seja, elementos unicos

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
         //peguei todos os conteudos do boot e coloquei dentro de conteudos inscritos
         //peguei o os devs inscritos do boot e add o this - o dev;
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); //o dev deve fazer os cursos na ordem em que foram disponibilizados
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo");;
        }
    }

    public double calcularTotalXP(){
       return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum(); //usei o stream api para pegar o xp de cada conteudo de dentro do set e somei
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override 
    public int hashCode(){
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
