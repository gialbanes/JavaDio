import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXP() {
        return xp_padrao + 20d; //quando eu criar a mentoria, o xp referente a mentoria, vai ser o xp padrao + 20
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }
    
}
