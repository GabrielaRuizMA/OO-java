package br.com.dio.desafio.dominio;

// essa classe é abstrata para que não se possa instanciar o Conteudo

public abstract class Conteudo {
    //aqui ele é protected, então apenas os filhos podem ter acesso a esse atributo (Curso e Mentoria são os filhos)
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
