package modelos;

import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria extends ObjetoBase{

    private String nome;
    private String descricao;

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id) &&
               Objects.equals(nome, categoria.nome) &&
               Objects.equals(descricao, categoria.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao);
    }


    @Override
    public void stringToObjetoBase(final String... dados) {
        id = Integer.parseInt(dados[0]);
        nome = dados[1];
        descricao = dados[2];
    }

    @Override
    public String[] objetoToString() {
        final String[] dados = new String[3];
        dados[0] = Integer.toString(id);
        dados[1] = nome;
        dados[2] = descricao;
        return dados;
    }
}
