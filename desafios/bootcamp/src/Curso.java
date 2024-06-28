public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return xp_padrao * cargaHoraria; //ao concluir o curso pega o xp padrao e multiplica pela carga horaria
    }
    
    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }
}
