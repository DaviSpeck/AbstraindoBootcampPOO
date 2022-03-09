package br.com.dio.desafio.dominio;

// Classe criada para praticar herança

public abstract  class Conteudo {

    protected static final double XP_PADRAO = 10d;

    // Atributos encapsulados através dos métodos "get" e "set"
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
