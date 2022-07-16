package br.com.dio.desafio.dominio;

//extends é uma classe reservada para a classe filha 
public class Curso extends Conteudo{

    private int cargaHoraria;

    //o @Override deve ficar acima do nome do método nas classes filhas para informar ao compilador que queremos sobrescrever o método
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //aqui os gets são utilizados pois o título e a descrição estão como privates na classe mãe
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
