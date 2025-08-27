package model;

import enums.Categoria;

public class Eventos {

    private String nome;
    private String endereco;
    private Categoria categoria;
    private String horario;
    private String descricao;

    public Eventos(String nome, String endereco, Categoria categoria, String horario, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return """            
               === Evento ===
               Nome: """ + nome
                + "\nEndereco: " + endereco
                + "\nCategoria: " + categoria
                + "\nHorario: " + horario
                + "\nDescricao: " + descricao
                + "\n";
    }

}
