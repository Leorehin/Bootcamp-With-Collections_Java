package Desafio.Dominio;

public class Curso extends Conteudo{
    
    private int cargaHoraria;
    
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso:\n[Titulo=" + getTitulo() + 
        "\nDescricao=" + getDescricao() + 
        "\nCargaHoraria=" + cargaHoraria + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * (double)cargaHoraria;
    }
}
