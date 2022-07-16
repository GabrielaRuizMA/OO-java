package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//extends é uma classe reservada para a classe filha 
public class Mentoria extends Conteudo{

    private LocalDate data;

     //o @Override deve ficar acima do nome do método nas classes filhas para informar ao compilador que queremos sobrescrever o método
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

     //aqui os gets são utilizados pois o título e a descrição estão como privates na classe mãe
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
